package Cobasaja.Percobaan2;

import Cobasaja.Mobil23;

public class Main23 {
    public static void main(String[] args) {
        Mobil23 m = new Mobil23();
        m.setMerk("Avanza");
        m.setBiaya(300000); 

        Sopir23 s = new Sopir23();
        s.setNama("Budi");
        s.setBiaya(150000);

        Pelanggan23 p = new Pelanggan23();
        p.setNama("Valent");
        p.setMobil(m);
        p.setSopir(s); 
        p.setHari(3);
// Sintaks p.setMobil(m) dan p.setSopir(s) berguna untuk menghubungkan objek (relasi agregasi). 
// Sintaks ini memasukkan referensi objek Mobil (m) dan Sopir (s) yang sudah dibuat di luar ke dalam variabel instance mobil dan sopir milik objek Pelanggan (p).
        System.out.println("Nama Pelanggan : " + p.getNama());
        System.out.println("Mobil          : " + p.getMobil().getMerk());
        System.out.println("Sopir          : " + p.getSopir().getNama());
        System.out.println("Lama Sewa      : " + p.getHari() + " hari");
        System.out.println("Total Biaya    : Rp " + p.hitungBiayaTotal());
// dipanggil untuk menghitung akumulasi total seluruh biaya sewa yang harus dibayar oleh pelanggan, 
// yaitu penjumlahan dari total biaya sewa mobil ditambah total biaya sewa sopir selama jumlah hari yang ditentukan.
    }
}