package LatihanKuis.Materi10;

public class _7MainPolimorfisme {
    public static void main(String[] args) {
        _6KasirKeuangan kasir = new _6KasirKeuangan();

        System.out.println("=== 1. DEMO STATIC POLYMORPHISM (METHOD OVERLOADING) ===");
        // Memanggil dua method bernama sama dengan argumen yang berbeda
        kasir.cetakInfo("Sistem Keuangan Kantor Siap Digunakan");
        kasir.cetakInfo("Anggaran Operasional Bulan Ini", 20000000);
        System.out.println();

        System.out.println("=== 2. DEMO DYNAMIC POLYMORPHISM & VMI ===");
        // Tipe referensi adalah induk (_2Pegawai), tapi objek aslinya adalah anak (_3Manajer).
        // Ini disebut UPCASTING (terjadi otomatis dan selalu aman).
        _2Pegawai peg = new _3Manajer("Budi", 8000000, 2000000);
        // Saat dijalankan, JVM mengeksekusi hitungNominalBayar() milik _3Manajer (10 juta), bukan _2Pegawai!
        System.out.println("Total bayaran referensi Pegawai (wujud Manajer): Rp" + peg.hitungNominalBayar());
        
        // Variabel 'peg' yang sama bisa berubah bentuk memegang objek _4Programmer!
        peg = new _4Programmer("Siti", 6000000, 1500000);
        System.out.println("Total bayaran referensi Pegawai (wujud Programmer): Rp" + peg.hitungNominalBayar());
        System.out.println();

        System.out.println("=== 3. DEMO HETEROGENEOUS COLLECTION & INSTANCEOF ===");
        // Array bertipe interface '_1BisaDibayar' mampu menampung berbagai objek berbeda class!
        _1BisaDibayar[] daftarPengeluaran = {
            new _3Manajer("Budi", 8000000, 2000000),
            new _4Programmer("Siti", 6000000, 1500000),
            new _5TagihanInternet("IndiHome Bisnis", 750000)
        };

        int totalKeluar = 0;
        // Memproses semua objek berbeda bentuk secara seragam dalam satu perulangan
        for (_1BisaDibayar item : daftarPengeluaran) {
            kasir.prosesPembayaran(item);
            totalKeluar += item.hitungNominalBayar();
            System.out.println("-------------------------------------------------");
        }

        kasir.cetakInfo("Total Seluruh Pengeluaran Kantor", totalKeluar);
    }
}