package Jobsheet4.Cobasaja.Percobaan4;

public class Penumpang23 {
    private String ktp;
    private String nama;
    
    public Penumpang23(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    public String getKtp() {
    return ktp; 
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }



}
