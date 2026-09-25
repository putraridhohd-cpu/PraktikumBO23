package kuis1;

public class Lensa {
    private String merk;
    private int focal;

    public Lensa () {
    }

    public Lensa(String merk, int focal) {
        this.merk = merk;
        this.focal = focal;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setFocal(int focal) {
        this.focal = focal;
    }

    public int getFocal() {
        return focal;
    }

    public void info() {
        System.out.println("Merk kamerqa : " + merk);
        System.out.println("Cache          : " + focal + " MB");
    }
}

//erk

