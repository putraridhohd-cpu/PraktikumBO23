package Jobsheet3.Logistik23;

public class TestLogistik23 {
    public static void main(String[] args) {
        Kontainer23 kontainerAlfa = new Kontainer23("REQ-9988", "PT maju Bersama", 5000);

        System.out.println("Nama pemilik kontainer: " +kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.println("\n Memasukkan muatan baru seberat 6000 kg ...");
        kontainerAlfa.tambahMuatan(6000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatini() + " kg");

        System.out.println("\n Memasukkan muatan baru seberat 4000 kg ...");
        kontainerAlfa.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatini() + " kg");

        System.out.println("\n Memasukkan muatan baru seberat 500 kg ...");
        kontainerAlfa.tambahMuatan(500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatini() + " kg");

        System.out.println("\n Memasukkan muatan baru seberat 1500 kg ...");
        kontainerAlfa.tambahMuatan(1500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatini() + " kg");

    }
}