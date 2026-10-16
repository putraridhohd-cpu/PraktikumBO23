package UTS1;

abstract class Mahasiswa23 {
    protected String nim;
    protected String nama;
    protected int sks;
    private Dosen23 dosenWali;

    public Mahasiswa23(String nim, String nama, int sks) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
    }

    public void setDosenWali(Dosen23 dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Dosen23 getDosenWali() {
        return dosenWali;
    }

    public abstract int hitungUKT();
    public abstract String getJenis();

    public String getNama() {
        return nama;
    }
}