package Jobsheet4.Cobasaja.Percobaan2;


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
       return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }

}