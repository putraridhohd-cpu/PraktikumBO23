package LatihanKuis.kuis4;

public class Main {
    public static void main(String[] args) {
        
        // PENTING UNTUK KUIS LISAN:
        // Elektronik e = new Elektronik("Gadget"); 
        // Baris di atas pasti COMPILE ERROR jika di-uncomment, karena Abstract Class tidak bisa di-new!

        System.out.println("=== UJI COBA LAPTOP ===");
        Laptop laptopAsus = new Laptop("Laptop Asus");
        
        laptopAsus.nyalakan();                 // Panggil method konkret dari induk Elektronik
        laptopAsus.fungsiUtama();              // Panggil abstract method yang sudah di-override
        laptopAsus.isiBaterai();               // Panggil method dari interface ChargeAble
        laptopAsus.hubungkanWifi("Kost_WiFi"); // Panggil method dari interface WifiConnectable

        System.out.println("\n=== UJI COBA RADIO ===");
        Radio radioTua = new Radio("Radio Jadul");
        
        radioTua.nyalakan();                  // Panggil method konkret dari induk Elektronik
        radioTua.fungsiUtama();               // Panggil abstract method yang sudah di-override
        
        // radioTua.isiBaterai(); 
        // Baris di atas pasti ERROR jika di-uncomment, karena Radio TIDAK meng-implements ChargeAble!
    }
}