package Cobasaja.Percobaan1;
public class Processor23 {
    private String merk;
    private double cache;

    public Processor23() {
    }

    public Processor23(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getCache() {
        return cache;
    }

    public void info() {
        System.out.println("Merk Processor : " + merk);
        System.out.println("Cache          : " + cache + " MB");
    }
}