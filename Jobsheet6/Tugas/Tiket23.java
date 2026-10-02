package Jobsheet6.Tugas;
public class Tiket23 {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String asal;
    protected String tujuan;
    private int hargaDasar;  // modfikasi Modifier diubah dari protected jadi private

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

    // Method Getter untuk mengakses atribut private hargaDasar
    public int getHargaDasar() {
        return hargaDasar;
    }

    public void tampilTiket() {
        System.out.printf("%-16s = %s\n", "Kode Tiket", kodeTiket);
        System.out.printf("%-16s = %s\n", "Nama Penumpang", namaPenumpang);
        System.out.printf("%-16s = %s - %s\n", "Rute", asal, tujuan);
        System.out.printf("%-16s = %d\n", "Harga Dasar", hargaDasar);
    }
}