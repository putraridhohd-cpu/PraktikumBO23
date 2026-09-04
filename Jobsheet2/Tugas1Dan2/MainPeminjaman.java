package Jobsheet2.Tugas1Dan2;

public class MainPeminjaman {
    public static void main(String[] args) {
        // Instansiasi objek peminjaman
        Peminjaman pjm1 = new Peminjaman();
        
        // Pengisian data transaksi
        pjm1.id = "PJ001";
        pjm1.namaMember = "Valent";
        pjm1.namaGame = "Minecraft";
        pjm1.hargaSewa = 15000; // Rp 15.000 / hari
        pjm1.lamaSewa = 3;      // 3 hari

        // Menampilkan data peminjaman
        pjm1.tampilDataPeminjaman();
    }
}
