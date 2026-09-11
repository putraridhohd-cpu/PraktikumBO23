package Jobsheet3.Logistik23;

import java.util.Scanner;

public class TestLogistik23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Kontainer23 kontainerAlfa = new Kontainer23("REQ-9988", "PT Valent Maju Sendiri", 5000);

        System.out.println("=== SISTEM MANAJEMEN LOGISTIK KONTAINER ===");
        System.out.println("Nama pemilik kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        System.out.println("-------------------------------------------");

        // Input Tambah Muatan Dinamis
        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        double beratTambah = sc.nextDouble();
        kontainerAlfa.tambahMuatan(beratTambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatini() + " kg");

        // Input Turunkan Muatan Dinamis
        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double beratTurun = sc.nextDouble();
        kontainerAlfa.turunkanMuatan(beratTurun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatini() + " kg");

        sc.close();
    }
}