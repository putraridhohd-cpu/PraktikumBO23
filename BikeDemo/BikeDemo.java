package BikeDemo;

public class BikeDemo {
    public static void main(String[] args) {
        // [MODIFIKASI] Penambahan objek sepeda baru (Total 5 objek)
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        Bike mountainBike3 = new Bike(); // [MODIFIKASI] Objek Mountain Bike ke-3
        
        RoadBike roadBike1 = new RoadBike();
        RoadBike roadBike2 = new RoadBike(); // [MODIFIKASI] Objek Road Bike ke-2

        // ================= MOUNTAIN BIKE 1 =================
        // [MODIFIKASI] Brand nama Valent Ridho & konfigurasi gear/akselerasi
        mountainBike1.setBrand("Valent Ridho - Polygon");
        mountainBike1.gearChanges(3);
        mountainBike1.speedAcceleration(20);
        mountainBike1.printInfo();
        System.out.println("-----------------------------------");

        // ================= MOUNTAIN BIKE 2 =================
        // [MODIFIKASI] Pengujian akselerasi dan deselerasi (pengereman)
        mountainBike2.setBrand("Valent Ridho - Giant");
        mountainBike2.gearChanges(5);
        mountainBike2.speedAcceleration(35);
        mountainBike2.speedDeceleration(10); // [MODIFIKASI] Fitur pengereman
        mountainBike2.printInfo();
        System.out.println("-----------------------------------");

        // ================= MOUNTAIN BIKE 3 =================
        // [MODIFIKASI] Objek baru & penguji batas kecepatan maksimum gear
        mountainBike3.setBrand("Valent Ridho - Trek X");
        mountainBike3.gearChanges(2);
        mountainBike3.speedAcceleration(15); // Melebihi limit gear 2 (max 10 km/h)
        mountainBike3.printInfo();
        System.out.println("-----------------------------------");

        // ================= ROAD BIKE 1 =================
        // [MODIFIKASI] Custom brand & lebar ban 23 mm
        roadBike1.setBrand("Valent Ridho - Specialized");
        roadBike1.setTireWidth(23); // [MODIFIKASI] Ukuran ban
        roadBike1.gearChanges(4);
        roadBike1.speedAcceleration(28);
        roadBike1.printInfo();
        System.out.println("-----------------------------------");

        // ================= ROAD BIKE 2 =================
        // [MODIFIKASI] Objek Road Bike baru & lebar ban 28 mm
        roadBike2.setBrand("Valent Ridho - Cervelo");
        roadBike2.setTireWidth(28); // [MODIFIKASI] Ukuran ban
        roadBike2.gearChanges(6);
        roadBike2.speedAcceleration(55);
        roadBike2.printInfo();
        System.out.println("-----------------------------------");
    }
}