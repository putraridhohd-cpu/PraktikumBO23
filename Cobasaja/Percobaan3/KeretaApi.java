package Cobasaja.Percobaan3;

// File: KeretaApi.java
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai23 masinis;
    private Pegawai23 asisten;

    // Overloading Constructor 1 (tanpa asisten)
    public KeretaApi(String nama, String kelas, Pegawai23 masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    // Overloading Constructor 2 (dengan asisten)
    public KeretaApi(String nama, String kelas, Pegawai23 masinis, Pegawai23 asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setMasinis(Pegawai23 masinis) {
        this.masinis = masinis;
    }

    public Pegawai23 getMasinis() {
        return masinis;
    }

    public void setAsisten(Pegawai23 asisten) {
        this.asisten = asisten;
    }

    public Pegawai23 getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama Kereta : " + this.nama + "\n";
        info += "Kelas       : " + this.kelas + "\n";
        info += "Masinis     : \n" + this.masinis.info();
        if (this.asisten != null) {
            info += "Asisten     : \n" + this.asisten.info();
        }
        return info;
    }
}
