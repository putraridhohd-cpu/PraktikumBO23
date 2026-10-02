package Jobsheet6.Tugas;

public class TestTiket23 {
    public static void main(String[] args) {
        // Objek 1: Diisi manual melalui variabel/field (karena atribut lain masih protected)
        // Dan untuk hargaDasar jika diisi di main class, harus dipanggil dari konstruktor atau setter.
        TiketKereta23 kereta = new TiketKereta23("KA-001", "Andi", "Malang", "Jakarta", 350000, 3, "12A");

        // Objek 2
        TiketDomestik23 domestik = new TiketDomestik23(
            "GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000
        );

        // Objek 3
        TiketInternasional23 internasional = new TiketInternasional23(
            "SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000
        );

        // Cetak
        kereta.tampilKereta();
        domestik.tampilDomestik();
        internasional.tampilInternasional();
    }
}