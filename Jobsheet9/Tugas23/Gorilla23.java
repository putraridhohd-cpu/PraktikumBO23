package Jobsheet9.Tugas23;

public class Gorilla23 extends Binatang23 implements IKarnivora23, IHerbivora23 {
    private String suara;
    private String warnaBulu;

    public Gorilla23(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Karnivora + Herbivora");
        System.out.println("Makanan: Daging + Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        super.displayBinatang();
    }

    public void displayData() {
        displayMakan();
        displayBinatang();
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
    }
}