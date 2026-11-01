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
}