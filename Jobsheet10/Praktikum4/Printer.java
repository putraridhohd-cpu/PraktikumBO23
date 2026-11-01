package Jobsheet10.Praktikum4;

public class Printer {
    protected String ukuranKertas;

    public Printer() {
        this.ukuranKertas = "A4";
    }

    public String getUkuranKertas() {
        return ukuranKertas;
    }

    // Method polimorfik induk untuk VMI
    public void cetak() {
        System.out.println("Mencetak dengan printer umum");
    }
}