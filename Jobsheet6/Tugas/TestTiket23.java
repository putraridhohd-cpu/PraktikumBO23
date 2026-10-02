package Jobsheet6.Tugas;

public class TestTiket23 {
    public static void main(String[] args) {
        // 1. Objek pertama dibuat dengan konstruktor TANPA parameter dan diisi manual
        TiketKereta23 kereta = new TiketKereta23();
        kereta.kodeTiket = "KA-001";
        kereta.namaPenumpang = "Andi";
        kereta.asal = "Malang";
        kereta.tujuan = "Jakarta";
        kereta.hargaDasar = 350000;
        kereta.nomorGerbong = 3;
        kereta.nomorKursi = "12A";

        // 2. Objek kedua dengan konstruktor berparameter
        TiketDomestik23 domestik = new TiketDomestik23(
            "GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000
        );

        // 3. Objek ketiga dengan konstruktor berparameter
        TiketInternasional23 internasional = new TiketInternasional23(
            "SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000
        );

        // Menampilkan output
        kereta.tampilKereta();
        domestik.tampilDomestik();
        internasional.tampilInternasional();
    }
}