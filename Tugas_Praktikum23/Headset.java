package Tugas_Praktikum23;

public class Headset {
    String merek;
    String tipeKoneksi;

    public Headset(String merek, String tipeKoneksi) {
        this.merek = merek;
        this.tipeKoneksi = tipeKoneksi;
    }

    public void putarMusik() {
        System.out.println("Memutar musik menggunakan " + merek);
    }

    public void aturVolume(int level) {
        System.out.println("Volume " + merek + " diatur ke level " + level);
    }

    public void cetakInformasi() {
        System.out.println("Merek Headset: " + merek);
        System.out.println("Tipe Koneksi : " + tipeKoneksi);
    }
}