package Jobsheet3.Bioskop23;

public class TestBioskop23 {
    public static void main(String[] args) {
        Tiket23 tiket1 = new Tiket23("Avengers: Endgame", -50000);
        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas? " + tiket1.isStatusPembayaran());

        System.out.println("\n Memproses bayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas terbaru?" + tiket1.isStatusPembayaran());
    }
    
}
