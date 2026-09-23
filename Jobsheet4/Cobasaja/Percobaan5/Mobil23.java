package Jobsheet4.Cobasaja.Percobaan5;

public class Mobil23 {
    private String merek;
    private Mesin23 mesin;

    public Mobil23(String merek) {
        this.merek = merek;
        this.mesin = new Mesin23();
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}