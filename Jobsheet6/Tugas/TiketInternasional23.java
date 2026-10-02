package Jobsheet6.Tugas;

public class TiketInternasional23 extends TiketPesawat23 {
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional23() {}

    public TiketInternasional23(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, String maskapai, int beratBagasi, String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        System.out.println("====== Tiket Pesawat Internasional ======");
        super.tampilPesawat();
        System.out.printf("%-16s = %s\n", "Nomor Paspor", nomorPaspor);
        System.out.printf("%-16s = %d\n", "Asuransi", asuransi);
        int totalBayar = hargaDasar + hitungBiayaBagasi() + asuransi;
        System.out.printf("%-16s = %d\n", "Total Bayar", totalBayar);
    }
}