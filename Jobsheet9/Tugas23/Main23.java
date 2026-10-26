package Jobsheet9.Tugas23;

public class Main23 {
    public static void main(String[] args) {
        Keledai23 keledai = new Keledai23("Keledai", 4, "Hehehehe", "Abu-Abu");
        Gorilla23 gorilla = new Gorilla23("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa23 singa = new Singa23("CingaCing", 4, "Roaar Roaaar", "Coklat");

        keledai.displayData();
        System.out.println();
        gorilla.displayData();
        System.out.println();
        singa.displayData();
    }
}