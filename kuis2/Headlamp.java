package kuis2;

public class Headlamp extends Perlengkapan {

    public Headlamp(String kode, String nama, double hargaSewa) {
        super(kode, nama, hargaSewa);
    }

    // ==========================================
    // MODIFIKASI: Implementasi catatanPemeriksaan()
    // Langsung mengembalikan String statis sesuai instruksi
    // ==========================================
    @Override
    public String catatanPemeriksaan() {
        return "cek nyala lampu & baterai";
    }
}