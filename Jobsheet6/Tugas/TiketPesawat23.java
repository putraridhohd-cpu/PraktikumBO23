package Jobsheet6.Tugas;

public class TiketPesawat23 extends Tiket23 {
    protected String maskapai;
    protected int beratBagasi;

    public TiketPesawat23() {}

    public TiketPesawat23(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    public int hitungBiayaBagasi() {
        if (beratBagasi > 20) {
            return (beratBagasi - 20) * 50000;
        }
        return 0;
    }

    public void tampilPesawat() {
        super.tampilTiket();
        System.out.printf("%-16s = %s\n", "Maskapai", maskapai);
        System.out.printf("%-16s = %d kg\n", "Berat Bagasi", beratBagasi);
        System.out.printf("%-16s = %d\n", "Biaya Bagasi", hitungBiayaBagasi());
    }
}