package LatihanKuis.Kuis1;

public class Buku {
    public String judul;
    public int harga;

    // Method menerima parameter namaToko
    public void tampikaninfo(String NamaToko) {
        System.out.println("Buku " + judul + "Dijual di" + NamaToko + "seharga " + harga);
    }

    
}
