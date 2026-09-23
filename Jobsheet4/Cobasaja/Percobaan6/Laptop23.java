package Jobsheet4.Cobasaja.Percobaan6;

public class Laptop23 {
    private String merk;

    public Laptop23(String merk) {
        this.merk = merk;
    }

    public void cetakDokumen(Printer23 printer, String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        printer.cetak(namaFile);
    }
}