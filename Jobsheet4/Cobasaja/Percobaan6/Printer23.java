package Jobsheet4.Cobasaja.Percobaan6;

public class Printer23 {
    private String merk;

    public Printer23(String merk) {
        this.merk = merk;
    }

    public void cetak(String namaFile) {
        System.out.println("[" + merk + "] Mencetak " + namaFile + "...");
        System.out.println("[" + merk + "] Selesai.");
    }
}
