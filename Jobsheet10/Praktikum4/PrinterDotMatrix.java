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
}