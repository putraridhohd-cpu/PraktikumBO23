package kuis2;

/** Memeriksa kondisi barang saat dikembalikan penyewa. */
public class PemeriksaBarang {
    // [MODIFIKASI SOAL 12] Tanpa instanceof dan tanpa casting:
    // cukup memanggil barang.catatanPemeriksaan() (polimorfisme).
    public void periksa(Perlengkapan barang) {
        System.out.println("Pemeriksaan " + barang.getKode() + ": " + barang.catatanPemeriksaan());
    }
}