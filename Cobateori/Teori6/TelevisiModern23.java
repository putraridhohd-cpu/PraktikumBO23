package Cobateori.Teori6;

public class TelevisiModern23 extends Televisi23 {
    private String displayMode;
    private String dvd;

    public TelevisiModern23(String mrk, int channelCount) {
        super(mrk, channelCount);
        this.dvd = "kosong";
    }

    public void changeDisplayMode(String mode) {
        this.displayMode = mode;
    }

    public void gantiModusTampilan(String mode) {
        changeDisplayMode(mode);
    }

    public void playDVD() {
        System.out.println("Sedang memainkan DVD: " + this.dvd);
    }

    public void mainkanDVD() {
        playDVD();
    }

    public void insertDVD(String dvdTitle) {
        this.dvd = dvdTitle;
    }

    public void masukkanDVD(String dvdTitle) {
        insertDVD(dvdTitle);
    }
}