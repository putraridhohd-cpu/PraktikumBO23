package LatihanKuis.kuis3;

public class Main {
    public static void main(String[] args) {
        // 1. Buat Objek-objek MataKuliah terpisah (Aggregation)
        MataKuliah mk1 = new MataKuliah("RTI242001", "Pemrograman Berorientasi Objek");
        MataKuliah mk2 = new MataKuliah("RTI242002", "Basis Data Lanjut");
        MataKuliah mk3 = new MataKuliah("RTI242003", "Desain Antarmuka Pengguna");

        // 2. Buat Objek Mahasiswa dengan kapasitas KRS 2
        Mahasiswa mhs = new Mahasiswa("2341720001", "Valent", 2);

        System.out.println("=== PROSES PENGISIAN KRS ===");
        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        
        // Uji coba melebihi kapasitas array (Defensive check)
        mhs.tambahMataKuliah(mk3); 

        // 3. Tampilkan KRS
        mhs.tampilkanKRS();

        // 4. Uji Coba Relasi USES-A dengan Printer
        Printer printerEpson = new Printer("Epson L3210");
        mhs.cetakKRS(printerEpson);
    }
}