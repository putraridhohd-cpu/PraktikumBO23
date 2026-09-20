package Jobsheet4.Cobasaja.Percobaan2;

public class Sopir23 {
    private String nama;
    private int biaya; 
    public Sopir23() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) {
    }

    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}