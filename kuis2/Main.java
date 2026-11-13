package kuis2;

public class Main {
    public static void main(String[] args) {
        // ... (Kode Inisialisasi Layanan, Repository, dll milik dosen Anda) ...
        
        // ... (Pemanggilan transaksi, dll) ...

        layanan.laporanPendapatan();
        
        // ==========================================
        // MODIFIKASI MAIN: Tambahan sesuai instruksi soal di kertas
        // ==========================================
        layanan.kembalikan("HL01"); 
        
        // Keterangan: Jika layanan.kembalikan("HL01") dipanggil, 
        // sistem seharusnya memanggil PemeriksaBarang.periksa(barang) di dalam logikanya,
        // dan menghasilkan output: "Pemeriksaan HL01: cek nyala lampu & baterai"
    }
}