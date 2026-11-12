package LatihanKuis.Materi9Lagi;

public class Main {
    public static void main(String[] args) {
        // Kendaraan k = new Kendaraan("Umum"); -> INI AKAN ERROR karena Kendaraan adalah abstract class!
        // BisaDiCharge b = new BisaDiCharge(); -> INI JUGA ERROR karena interface tidak bisa di-new!

        // Objek dibuat dari class konkret (turunannya)
        MobilBensin mobil = new MobilBensin("Toyota Avanza");
        SepedaListrik sepeda = new SepedaListrik("Xiaomi Himo");
        Powerbank pb = new Powerbank(10000);

        System.out.println("=== 1. DEMO ABSTRACT CLASS & POLIMORFISME ===");
        // Array bertipe superclass (Kendaraan) bisa menampung berbagai objek turunannya
        Kendaraan[] daftarKendaraan = { mobil, sepeda };
        for (Kendaraan k : daftarKendaraan) {
            k.tampilkanMerk();  // Memanggil method konkret warisan Kendaraan
            k.nyalakanMesin();  // Memanggil method abstract yang isinya menyesuaikan objek aslinya
            System.out.println();
        }

        System.out.println("=== 2. DEMO MULTIPLE INTERFACE ===");
        mobil.lacakLokasi();
        sepeda.lacakLokasi();
        System.out.println();

        System.out.println("=== 3. DEMO INTERFACE PADA BEDA HIERARKI ===");
        StasiunCharging stasiun = new StasiunCharging();
        // StasiunCharging tidak peduli apakah objeknya kendaraan atau gadget,
        // selama meng-implements BisaDiCharge, keduanya bisa di-charge!
        stasiun.mulaiCharging(sepeda);
        stasiun.mulaiCharging(pb);
    }
}