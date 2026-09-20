package Jobsheet4.Cobasaja.Percobaan2;

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
        System.out.println("Nama Pelanggan : " + p.getNama());
        System.out.println("Mobil          : " + p.getMobil().getMerk());
        System.out.println("Sopir          : " + p.getSopir().getNama());
        System.out.println("Lama Sewa      : " + p.getHari() + " hari");
        System.out.println("Total Biaya    : Rp " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}