package LatihanKuis.Materi9;

// Class Laptop: 
// 1. ADALAH Elektronik (extends Elektronik) -> Cuma boleh extends 1 class
// 2. BISA isi baterai & terhubung WiFi (implements ChargeAble, WifiConnectable) -> Boleh banyak interface
public class Laptop extends Elektronik implements ChargeAble, WifiConnectable {

    public Laptop(String namaPerangkat) {
        super(namaPerangkat); // Memanggil constructor milik class induk (Elektronik)
    }

    // WAJIB 1: Mengisi (override) abstract method dari induk Elektronik
    @Override
    public void fungsiUtama() {
        System.out.println(namaPerangkat + " digunakan untuk mengetik dan ngoding.");
    }

    // WAJIB 2: Mengisi method dari Interface ChargeAble (Wajib pakai modifier 'public')
    @Override
    public void isiBaterai() {
        System.out.println(namaPerangkat + " sedang diisi daya dengan charger Type-C.");
    }

    // WAJIB 3: Mengisi method dari Interface WifiConnectable
    @Override
    public void hubungkanWifi(String namaWifi) {
        System.out.println(namaPerangkat + " berhasil terhubung ke WiFi: " + namaWifi);
    }
}