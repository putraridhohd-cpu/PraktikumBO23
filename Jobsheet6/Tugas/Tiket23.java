package Jobsheet6.Tugas;
public class Tiket23 {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String asal;
    protected String tujuan;
    protected int hargaDasar; 

    // Konstruktor tanpa parameter
    public Tiket23() {}

    // Konstruktor berparameter
    public Tiket23(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    public void tampilTiket() {
        System.out.printf("%-16s = %s\n", "Kode Tiket", kodeTiket);
        System.out.printf("%-16s = %s\n", "Nama Penumpang", namaPenumpang);
        System.out.printf("%-16s = %s - %s\n", "Rute", asal, tujuan);
        System.out.printf("%-16s = %d\n", "Harga Dasar", hargaDasar);
    }
}