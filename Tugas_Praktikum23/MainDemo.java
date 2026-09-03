package Tugas_Praktikum23;

public class MainDemo {
    public static void main(String[] args) {
        // Instansiasi Objek
        Gadget gadgetUmum = new Gadget("Generic Device", "Hitam");
        Smartphone hpInfinix = new Smartphone("Infinix Hot 40i", "Hitam", 5000, 6.56);
        Laptop laptopZyrex = new Laptop("Zyrex D Tech Pro V1", "Abu-abu", "AMD Ryzen 5", 8);
        Headset headsetJBL = new Headset("JBL T450BT", "Bluetooth");
        Biskuit biskuitRoma = new Biskuit("Roma Kelapa", "Kelapa Gurih");

        // 1. Eksekusi Method Gadget
        System.out.println("=== 1. OBJEK GADGET (SUPERCLASS) ===");
        gadgetUmum.nyalakan();
        gadgetUmum.cetakInformasi();
        gadgetUmum.matikan();
        System.out.println();

        // 2. Eksekusi Method Smartphone
        System.out.println("=== 2. OBJEK SMARTPHONE ===");
        hpInfinix.nyalakan();
        hpInfinix.panggilTelepon("08123456789");
        hpInfinix.mainGame();
        hpInfinix.cetakInformasi();
        System.out.println();

        // 3. Eksekusi Method Laptop
        System.out.println("=== 3. OBJEK LAPTOP ===");
        laptopZyrex.nyalakan();
        laptopZyrex.bukaVSCode();
        laptopZyrex.streamingVideo();
        laptopZyrex.cetakInformasi();
        System.out.println();

        // 4. Eksekusi Method Headset
        System.out.println("=== 4. OBJEK HEADSET ===");
        headsetJBL.putarMusik();
        headsetJBL.aturVolume(80);
        headsetJBL.cetakInformasi();
        System.out.println();

        // 5. Eksekusi Method Biskuit
        System.out.println("=== 5. OBJEK BISKUIT ===");
        biskuitRoma.bukaBungkus();
        biskuitRoma.makan();
        biskuitRoma.cetakInformasi();
    }
}
