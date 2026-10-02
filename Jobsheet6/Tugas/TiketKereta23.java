package Jobsheet6.Tugas;
public class TiketKereta23 extends Tiket23 {
    protected int nomorGerbong;
    protected String nomorKursi;

    public TiketKereta23() {}

    public TiketKereta23(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, int nomorGerbong, String nomorKursi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public void tampilKereta() {
        System.out.println("============ Tiket Kereta ============");
        super.tampilTiket();
        System.out.printf("%-16s = %d\n", "Nomor Gerbong", nomorGerbong);
        System.out.printf("%-16s = %s\n", "Nomor Kursi", nomorKursi);
        // [PERBAIKAN] Menggunakan getHargaDasar()
        System.out.printf("%-16s = %d\n", "Total Bayar", getHargaDasar());
    }
}