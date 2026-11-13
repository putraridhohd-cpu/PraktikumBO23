package kuis2;

public abstract class Perlengkapan {
    protected String kode;
    protected String nama;
    protected double hargaSewa;

    public Perlengkapan(String kode, String nama, double hargaSewa) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSewa = hargaSewa;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    // ==========================================
    // MODIFIKASI: PENAMBAHAN METHOD ABSTRACT BARU
    // Method ini memaksa semua kelas anak (Tenda, Carrier, dll)
    // untuk memiliki cara pemeriksaannya masing-masing.
    // ==========================================
    public abstract String catatanPemeriksaan();
}