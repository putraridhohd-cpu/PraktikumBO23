package Jobsheet2.Tugas4;

public class MainBarang23 {
    public static void main(String[] args) {
        // Instansiasi objek Barang23
        Barang23 brg = new Barang23();

        // Pengisian nilai atribut
        brg.kode = "BRG01";
        brg.namaBarang = "Hp infinix hot 40i";
        brg.hargaDasar = 1599000;
        brg.diskon = 0.10f; // Diskon 10%

        // Menampilkan data barang beserta harga jualnya
        brg.tampilData();
    }
}