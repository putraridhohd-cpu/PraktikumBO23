package kuis2;

public class Carrier extends Perlengkapan {
    private int kapasitasLiter;

    public Carrier(String kode, String nama, double hargaSewa, int kapasitasLiter) {
        super(kode, nama, hargaSewa);
        this.kapasitasLiter = kapasitasLiter;
    }

    public String cekResleting() {
        return "cek fungsi resleting & jahitan tali";
    }

    // ==========================================
    // MODIFIKASI: Implementasi catatanPemeriksaan()
    // Mengembalikan method cekResleting() sesuai instruksi
    // ==========================================
    @Override
    public String catatanPemeriksaan() {
        return cekResleting();
    }
}