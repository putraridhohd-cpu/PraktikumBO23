package Jobsheet10.Praktikum4;

public class PrinterLaser extends Printer {
    private String jenisTinta;

    public PrinterLaser() {
        this.jenisTinta = "Toner Bubuk";
        this.ukuranKertas = "F4";
    }

    public String getJenisTinta() {
        return jenisTinta;
    }

    @Override
    public void cetak() {
        System.out.println("Mencetak dengan printer laser, tinta: " + jenisTinta);
        System.out.println("Ukuran kertas: " + ukuranKertas);
    }
}