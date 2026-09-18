package Cobasaja.Percobaan2;

import Cobasaja.Mobil23;

public class Pelanggan23 {
    private String nama;
    private Mobil23 mobil;
    private Sopir23 sopir;
    private int hari;

    public Pelanggan23() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setMobil(Mobil23 mobil) {
        this.mobil = mobil;
    }

    public Mobil23 getMobil() {
        return mobil;
    }

    public void setSopir(Sopir23 sopir) {
        this.sopir = sopir;
    }

    public Sopir23 getSopir() {
        return sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari() {
        return hari;
    }

    public int hitungBiayaTotal() {
        int totalMobil = (mobil != null) ? mobil.hitungBiayaMobil(hari) : 0;
        int totalSopir = (sopir != null) ? sopir.hitungBiayaSopir(hari) : 0;
        return totalMobil + totalSopir;
    }
    
}