package Jobsheet10.Praktikum4;

public class PrinterInkjet extends Printer {
private String jenisTinta;
public PrinterInkjet() {
this.jenisTinta = "Tinta Cair";
this.ukuranKertas = "A4";
}
public String getJenisTinta() {
return jenisTinta;
}
}