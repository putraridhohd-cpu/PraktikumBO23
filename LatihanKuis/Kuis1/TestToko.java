package LatihanKuis.Kuis1;

public class TestToko {
    public static void main(String[] args) {
        Buku bk = new Buku();
        bk.judul = "Pemrograman Java";
        bk.harga = 85000;
        // Kirimkan nilai "Gramedia Valent" sebagai parameter
        bk.tampikaninfo("Gramedia Valent");

        System.out.println("-----------");
        Buku bk1 = new Buku();
        bk1.judul = "Algoritma Dasar";
        bk1.harga = 60000;
        // Kirimkan nilai "Gramedia Valent" sebagai parameter
        bk1.tampikaninfo("Gramedia Valent");


        
    }
    
}
