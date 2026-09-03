package Tugas_Praktikum23;

public class Gadget {
    String merek;
    String warna;

    public Gadget(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public void nyalakan() {
        System.out.println(merek + " berhasil dinyalakan.");
    }

    public void matikan() {
        System.out.println(merek + " dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("Merek Gadget : " + merek);
        System.out.println("Warna        : " + warna);
    }
}