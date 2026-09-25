package LatihanKuis.kuis3;

public class Printer {
    private String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    // Method yang dipanggil secara insidental (USES-A)
    public void cetak(String dokumen) {
        System.out.println("\n[Printer " + merk + " Mencetak]");
        System.out.println(dokumen);
    }
}