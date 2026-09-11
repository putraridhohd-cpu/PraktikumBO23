package Jobsheet3.Logistik23;

public class Kontainer23 {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer23(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public void setNomorResi(String nomorResi) {
        this.nomorResi = nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public void setKapasitasMaksimal(double kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

    public double getBeratMuatanSaatini() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat) {
        if (beratMuatanSaatIni + berat <= kapasitasMaksimal) {
            beratMuatanSaatIni += berat;
        } else {
            System.out.println("Gagal menambah muatan! Berat melebihi kapasitas maksimal.");
        }
    }

    public void kurangiMuatan(double berat) {
        if (beratMuatanSaatIni - berat >= 0) {
            beratMuatanSaatIni -= berat;
        } else {
            System.out.println("Gagal mengurangi muatan! Jumlah pengurangan melebihi muatan saat ini.");
        }
    }
}