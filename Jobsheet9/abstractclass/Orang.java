package Jobsheet9.abstractclass;

public class Orang {
    private String nama;
    private Hewan hewanpeliharaan;

    public Orang(String nama) {
        this.nama = nama;

    }

    public void peliharaHewan(Hewan hewan) {
        this.hewanpeliharaan = hewan;
    }

    public void ajakPeliharaanJalanJalan() {
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaan ku berjalan dengan cara: ");
        this.hewanpeliharaan.bergerak();
        System.out.println("---------------------------");
    }
    
}
