package LatihanKuis.Materi10;

public class _6KasirKeuangan {

    // =========================================================================
    // 1. STATIC POLYMORPHISM (Method Overloading)
    // Nama method sama persis ('cetakInfo'), tapi jumlah/tipe parameternya beda.
    // Compiler sudah tahu method mana yang dipakai sejak program di-compile.
    // =========================================================================
    public void cetakInfo(String pesan) {
        System.out.println("[INFO KASIR] " + pesan);
    }

    public void cetakInfo(String kategori, int totalDana) {
        System.out.println("[INFO KASIR] " + kategori + " : Rp" + totalDana);
    }

    // =========================================================================
    // 2. POLYMORPHIC ARGUMENTS, OPERATOR instanceof, & DOWNCASTING
    // Parameter bertipe interface '_1BisaDibayar' sehingga sanggup menerima
    // objek Manajer, Programmer, maupun TagihanInternet dalam satu method saja!
    // =========================================================================
    public void prosesPembayaran(_1BisaDibayar item) {
        // Virtual Method Invocation (VMI):
        // Java otomatis memanggil hitungNominalBayar() milik objek aslinya saat runtime!
        int nominal = item.hitungNominalBayar();

        // OPERATOR 'instanceof': Mengecek identitas asli objek di balik layar dengan aman
        if (item instanceof _3Manajer) {
            // DOWNCASTING: Mengubah tipe referensi umum (_1BisaDibayar) kembali ke tipe aslinya (_3Manajer)
            // agar bisa memanggil method khusus seperti getNama() dan pimpinRapat().
            _3Manajer m = (_3Manajer) item;
            System.out.println("Membayar Gaji Manajer (" + m.getNama() + ") : Rp" + nominal);
            m.pimpinRapat();

        } else if (item instanceof _4Programmer p) {
            // MODERN JAVA (Java 16+ Pattern Matching for instanceof):
            // Pengecekan tipe dan downcasting ke variabel 'p' dilakukan sekaligus dalam satu baris!
            System.out.println("Membayar Gaji Programmer (" + p.getNama() + ") : Rp" + nominal);
            p.ngodingFitur();

        } else if (item instanceof _5TagihanInternet tagihan) {
            System.out.println("Membayar Tagihan WiFi (" + tagihan.getNamaProvider() + ") : Rp" + nominal);
        }
    }
}