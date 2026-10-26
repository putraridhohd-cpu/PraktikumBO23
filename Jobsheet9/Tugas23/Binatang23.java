package Jobsheet9.Tugas23;

public abstract class Binatang23 {
    protected String nama;
    protected int jmlKaki;

    public Binatang23(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public int getKaki() {
        return jmlKaki;
    }

    public void displayBinatang() {
        System.out.println("Nama: " + getNama());
        System.out.println("Jumlah Kaki: " + getKaki());
    }
}