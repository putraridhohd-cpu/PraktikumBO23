package Jobsheet4.Cobasaja.Percobaan4;

public class Kursi23 {
    private String nomor;
    private Penumpang23 penumpang;

    public Kursi23(String nomor) {
        this.nomor = nomor;
    }
    
    public void setPenumpang(Penumpang23 penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang23 getPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
