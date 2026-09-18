package Jobsheet4.Cobasaja.Percobaan3;

public class Pegawai23 {
    private String nip;
    private String nama;

    public Pegawai23(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "NIP   : " + this.nip + "\n";
        info += "Nama  : " + this.nama + "\n";
        return info;
    }
}