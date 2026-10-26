package Jobsheet9.Tugas23;

public class Keledai23 extends Binatang23 implements IHerbivora23 {
    private String suara;
    private String warnaBulu;

    public Keledai23(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis: Herbivora");
        System.out.println("Makanan: Tumbuhan");
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