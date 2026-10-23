package Cobateori.Teori9;

public class Ikan extends Hewan {
    public Ikan(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berenang dengan sirip");
    }
}
