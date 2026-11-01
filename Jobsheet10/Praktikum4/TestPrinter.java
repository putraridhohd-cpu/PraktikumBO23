package Jobsheet10.Praktikum4;

public class TestPrinter {
    public static void main(String[] args) {
        Operator dimas = new Operator();
        PrinterInkjet inkjet = new PrinterInkjet();
        PrinterLaser laser = new PrinterLaser();
        PrinterDotMatrix dotMatrix = new PrinterDotMatrix(); // Tambah objek Dot Matrix

        dimas.cetakDokumen(inkjet);
        dimas.cetakDokumen(laser);
        dimas.cetakDokumen(dotMatrix); // Panggil cetak dokumen dot matrix
    }
}