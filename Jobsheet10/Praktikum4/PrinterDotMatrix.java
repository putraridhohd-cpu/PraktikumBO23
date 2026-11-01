package Jobsheet10.Praktikum4;

public class PrinterDotMatrix extends Printer {
    private String jenisTinta;

    public PrinterDotMatrix() {
        this.jenisTinta = "Pita Ribbon";
        this.ukuranKertas = "Continuous Paper";
    }

    public String getJenisTinta() {
        return jenisTinta;
    }

    @Override
    public void cetak() {
        System.out.println("Mencetak dengan printer dot matrix, tinta: " + jenisTinta);
        System.out.println("Ukuran kertas: " + ukuranKertas);
    }
}