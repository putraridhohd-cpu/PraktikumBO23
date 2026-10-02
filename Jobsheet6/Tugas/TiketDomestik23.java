package Jobsheet6.Tugas;

public class TiketDomestik23 extends TiketPesawat23 {
    protected int pajakBandara;

    public TiketDomestik23() {}

    public TiketDomestik23(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, int pajakBandara) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.pajakBandara = pajakBandara;
    }

    public void tampilDomestik() {
        System.out.println("======== Tiket Pesawat Domestik ========");
        super.tampilPesawat();
        System.out.printf("%-16s = %d\n", "Pajak Bandara", pajakBandara);
        int totalBayar = hargaDasar + hitungBiayaBagasi() + pajakBandara;
        System.out.printf("%-16s = %d\n", "Total Bayar", totalBayar);
    }
}