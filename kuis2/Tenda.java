package kuis2;

public class Tenda extends Perlengkapan {
    private int kapasitas;

    public Tenda(String kode, String nama, double hargaSewa, int kapasitas) {
        super(kode, nama, hargaSewa);
        this.kapasitas = kapasitas;
    }

    public String cekFrame() {
        return "cek kelengkapan frame & pasak"; 
    }

    // ==========================================
    // MODIFIKASI: Implementasi catatanPemeriksaan()
    // Mengembalikan method cekFrame() sesuai instruksi
    // ==========================================
    @Override
    public String catatanPemeriksaan() {
        return cekFrame();
    }
}