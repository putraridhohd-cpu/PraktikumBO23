package Cobateori.Teori6;

public class TestTelevisi23 {
    public static void main(String[] args) {
        TelevisiModern23 tv = new TelevisiModern23("Samsong", 100);

        System.out.println("Channel aktif: " + tv.getChannelAktif());
        tv.pindahChannel(20);
        System.out.println("Channel aktif sekarang: " + tv.getChannelAktif());
        tv.gantiModusTampilan("HDMI");
        tv.mainkanDVD();
        tv.masukkanDVD("The Matrix");
        tv.mainkanDVD();
    }
}