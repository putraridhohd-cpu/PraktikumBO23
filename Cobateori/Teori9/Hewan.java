package Cobateori.Teori9;

public abstract class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public abstract void bergerak();

    public void tambahUmur() {
        umur++;
        System.out.println(nama + " berumur " + umur + " tahun");
    }
}
