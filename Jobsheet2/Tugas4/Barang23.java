package Jobsheet2.Tugas4;

public class Barang23 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon; // Diskon disimpang dalam bentuk desimal (misal: 10% = 0.10f)

    // Method untuk menghitung harga jual
    // Rumus: hargaJual = hargaDasar - (diskon * hargaDasar)
    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    // Method untuk menampilkan informasi lengkap barang
    public void tampilData() {
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Dasar  : Rp " + hargaDasar);
        System.out.println("Diskon       : " + (int)(diskon * 100) + "%");
        System.out.println("Harga Jual   : Rp " + hitungHargaJual());
    }
}