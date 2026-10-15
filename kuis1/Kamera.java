package kuis1;

public class Kamera {
    private String merk;
    private Lensa lensa;

    public Kamera() {
    }

    public Kamera(String merk, Lensa lensa) {
        this.merk = merk;
        this.lensa = lensa;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setLensa(Lensa lensa) {
        this.lensa = lensa;
    }

    public Lensa getLensa() {
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