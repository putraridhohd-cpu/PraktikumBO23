package Cobasaja.Percobaan3;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        Pegawai23 masinis = new Pegawai23("1234", "Setyo");
        Pegawai23 asisten = new Pegawai23("5678", "Rahmad");
        
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaApi.info());
    }
}
