package LatihanKuis.kuis3;

public class Mahasiswa {
    private String nim;
    private String nama;
    private MataKuliah[] listMK; // Array of Objects
    private int jumlahMK;

    public Mahasiswa(String nim, String nama, int kapasitasKRS) {
        this.nim = nim;
        this.nama = nama;
        this.listMK = new MataKuliah[kapasitasKRS];
        this.jumlahMK = 0;
    }

    // Aggregation: Objek MataKuliah dibuat di luar, lalu di-inject ke method
    public void tambahMataKuliah(MataKuliah mk) {
        // Defensive Programming: Validasi null dan kapasitas array
        if (mk == null) {
            System.out.println("Gagal: Objek MataKuliah tidak valid (null)!");
            return;
        }

        if (jumlahMK < listMK.length) {
            listMK[jumlahMK] = mk;
            jumlahMK++;
            System.out.println("Berhasil menambahkan MK: " + mk.getNama());
        } else {
            System.out.println("Gagal: Kapasitas KRS untuk " + nama + " sudah penuh!");
        }
    }

    public void tampilkanKRS() {
        System.out.println("\n=== KARTU RENCANA STUDI ===");
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Daftar Mata Kuliah:");

        if (jumlahMK == 0) {
            System.out.println("(Belum ada mata kuliah yang diambil)");
            return;
        }

        // Iterasi aman menggunakan counter jumlahMK
        for (int i = 0; i < jumlahMK; i++) {
            if (listMK[i] != null) { // Defensive programming: Null Check
                listMK[i].tampilkanInfo();
            }
        }
    }

    // USES-A: Printer hanya lewat sebagai parameter method, TIDAK disimpan sebagai atribut
    public void cetakKRS(Printer p) {
        if (p == null) {
            System.out.println("Gagal mencetak: Printer tidak ditemukan!");
            return;
        }

        String teksDokumen = "=== CETAK KRS ===\nNIM: " + nim + "\nNama: " + nama + "\nTotal MK: " + jumlahMK;
        p.cetak(teksDokumen);
    }
}