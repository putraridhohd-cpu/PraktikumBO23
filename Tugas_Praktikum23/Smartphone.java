package Tugas_Praktikum23;

public class Smartphone extends Gadget {
    int kapasitasBaterai;
    double ukuranLayar;

    public Smartphone(String merek, String warna, int kapasitasBaterai, double ukuranLayar) {
        super(merek, warna);
        this.kapasitasBaterai = kapasitasBaterai;
        this.ukuranLayar = ukuranLayar;
    }

    public void panggilTelepon(String nomor) {
        System.out.println(merek + " melakukan panggilan ke " + nomor);
    }

    public void mainGame() {
        System.out.println("Bermain game di HP " + merek);
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Baterai      : " + kapasitasBaterai + " mAh");
        System.out.println("Ukuran Layar : " + ukuranLayar + " inci");
    }
}