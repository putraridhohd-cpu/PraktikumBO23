package Tugas_Praktikum23;

public class Laptop extends Gadget {
    String processor;
    int ram;

    public Laptop(String merek, String warna, String processor, int ram) {
        super(merek, warna);
        this.processor = processor;
        this.ram = ram;
    }

    public void bukaVSCode() {
        System.out.println("Membuka VS Code di laptop " + merek);
    }

    public void streamingVideo() {
        System.out.println("Nonton streaming video di " + merek);
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Processor    : " + processor);
        System.out.println("Ukuran RAM   : " + ram + " GB");
    }
}