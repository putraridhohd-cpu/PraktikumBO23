package Jobsheet4.Cobasaja.Percobaan4;

public class Main23 {
    public static void main(String[] args) {
        Penumpang23 p = new Penumpang23("12345", "Valent");
        Gerbong23 gerbong = new Gerbong23("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
    
}
