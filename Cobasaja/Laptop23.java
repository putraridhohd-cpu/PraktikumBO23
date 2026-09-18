package Cobasaja;
public class Laptop23 {
    private String merk;
    private Processor23 proc;

    public Laptop23() {
    }

    public Laptop23(String merk, Processor23 proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(Processor23 proc) {
        this.proc = proc;
    }

    public Processor23 getProc() {
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop    : " + merk);
        if (proc != null) {
            proc.info();
        } else {
            System.out.println("Processor belum dipasang.");
        }
    }
}