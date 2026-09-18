package Cobasaja.Percobaan3;
public class Main {
    public static void main(String[] args) {
        Pegawai23 masinis = new Pegawai23("1234", "Valent Ridho");
        Pegawai23 asisten = new Pegawai23("5678", "Putra santoso");
        
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaApi.info());
    }
}
