package Jobsheet4.Cobasaja.Percobaan4;

public class Gerbong23 {
    private String kode;
    private Kursi23[] arrayKursi;

    public Gerbong23(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi23[jumlah];
        this.initkursi();
    }

    private void initkursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi23(String.valueOf(i + 1));
        }
    }
    
    public void setPenumpang(Penumpang23 penumpang, int nomor) {
    if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
        System.out.println("Peringatan: Kursi nomor " + nomor + " sudah terisi oleh penumpang lain!");
    } else {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
}



    public String info() {
            String info = "";
            info += "Kode: " + kode + "\n";
            for (Kursi23 kursi : arrayKursi) {
                info += kursi.info();
            }
            return info;
    }
    
}
