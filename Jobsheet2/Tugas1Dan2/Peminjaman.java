package Jobsheet2.Tugas1Dan2;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public double hargaSewa; // Harga sewa per hari
    public int lamaSewa;     // Jumlah hari sewa

    // Method untuk menghitung total harga yang harus dibayar
    public double hitungHargaBayar() {
        return lamaSewa * hargaSewa;
    }

    // Method untuk menampilkan detail transaksi peminjaman
    public void tampilDataPeminjaman() {
        System.out.println("ID Peminjaman : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Harga / Hari  : Rp " + hargaSewa);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Total Bayar   : Rp " + hitungHargaBayar());
    }
}