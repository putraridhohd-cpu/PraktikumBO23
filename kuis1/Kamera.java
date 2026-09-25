package kuis1;

public class Kamera {
    private String merk;
    private int lensa;

    public Kamera() {
    }

    public Kamera(String merk, int lensa) {
        this.merk = merk;
        this.lensa = lensa;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setlensa(int lensa) {
        this.lensa = lensa;
    }

    public int getLensa() {
        return lensa;
    }

    public void info() {
        System.out.println("Merk kamera    : " + merk);
        if ( lensa != null) {
            lensa.info();
        } else {
            System.out.println("lensa belum terpasang.");
        }
    }
}