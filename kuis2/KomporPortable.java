package kuis2;

public class KomporPortable extends Perlengkapan implements Diasuransikan {
    private static final int HARGA_GAS_PER_HARI = 5000;

    public KomporPortable(String kode, String nama, int tarifHarian) {
        super(kode, nama, tarifHarian);
    }

    /** Setiap hari sewa mendapat satu tabung gas. */
    @Override
    protected int biayaTambahan(int hari) {
        return HARGA_GAS_PER_HARI * hari;
    }

    @Override
    public String getKategori() {
        return "Alat Masak";
    }

    @Override
    public int premiAsuransi(int hari) {
        return 1000 * hari;
    }

    public String cekRegulator() {
        return "cek regulator & selang gas";
    }
}
