package kuis2;

public class KomporPortable extends Perlengkapan {

    public KomporPortable(String kode, String nama, double hargaSewa) {
        super(kode, nama, hargaSewa);
    }

    public String cekRegulator() {
        return "cek regulator & selang gas";
    }

    // ==========================================
    // MODIFIKASI: Implementasi catatanPemeriksaan()
    // Mengembalikan method cekRegulator() sesuai instruksi
    // ==========================================
    @Override
    public String catatanPemeriksaan() {
        return cekRegulator();
    }
}