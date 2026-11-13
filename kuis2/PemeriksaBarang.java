package kuis2;

public class PemeriksaBarang {
    
    // ==========================================
    // MODIFIKASI: REFACTORING METHOD periksa()
    // Tidak ada lagi rantai instanceof dan downcasting.
    // Cukup panggil barang.catatanPemeriksaan().
    // ==========================================
    public static void periksa(Perlengkapan barang) {
        // Output format: Pemeriksaan [Kode Barang]: [Hasil Catatan]
        System.out.println("Pemeriksaan " + barang.getKode() + ": " + barang.catatanPemeriksaan());
    }
}