package Cobasaja.Percobaan2;

public class Sopir23 {
    private String nama;
    private int biaya; // Gunakan huruf kecil diawal (biaya)

    public Sopir23() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) { // Gunakan setBiaya (s kecil)
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}