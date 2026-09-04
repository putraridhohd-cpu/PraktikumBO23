package Jobsheet2.Percobaan2;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1=new Barang();
         brg1.namaBrg="HP";
         brg1.jenisBrg="Infinix hot 40i";
         brg1.stok=10;

         // buat nampilin dan ngisi argumen buat mindahin stok barang
         System.out.println("Stok baru milik mahasiswa bernama VALENT adalah = " +brg1.tambahStok(20));

    }
    
}
