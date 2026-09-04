package Jobsheet2.Percobaan2;

public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarang() {
    System.out.println("Namaa Barang nya valent  :" + namaBrg);
    System.out.println("Jenis Barang nya valent  : " + jenisBrg);
    System.out.println("Stok barang nya valent   :" + stok);
    }

    // mehod ini buat argumen dan nilai balik nya (return)
    public int tambahStok(int brgMasuk) {
        int stokBaru=brgMasuk+stok;
        return stokBaru;
    }
    
}
