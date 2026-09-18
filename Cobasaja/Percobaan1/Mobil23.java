package Cobasaja.Percobaan1;

public class Mobil23 {
    private String merk;
    private int Biaya;

    public Mobil23() {

    }
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setBiaya(int Biaya) {
        this.Biaya = Biaya;
    }

    public int getBiaya() {
        return Biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return Biaya * hari;
    }
    
}
