package UTS1;

public class MainVarians23 {
    public static void main(String[] args) {
        Jurusan23 jurusan = new Jurusan23("Teknologi Informasi", 2, 2);
        Dosen23 kajur = new Dosen23("001", "Pak Imam");
        jurusan.setKajur(kajur);

        Dosen23 dosenWali = new Dosen23("002", "Bu Vivi");

        Mahasiswa23 m = new MahasiswaBeasiswa23("2341720099", "Mentari", 20, 25);
        Mahasiswa23 m1 = new MahasiswaReguler23("2341720001", "Lestari", 20);
        Mahasiswa23 m2 = new MahasiswaBeasiswa23("2341720002", "Usman", 24, 50);
        Mahasiswa23 m3 = new MahasiswaReguler23("2341720003", "Anugrah", 22);

        m1.setDosenWali(dosenWali);
        m2.setDosenWali(dosenWali);
        m3.setDosenWali(dosenWali);

        jurusan.daftarPraktikum(m1);
        jurusan.daftarPraktikum(m2);
        jurusan.daftarPraktikum(m3);

        BagianKeuangan23 keuangan = new BagianKeuangan23("Keuangan");
        keuangan.cetakTagihan(m1);
        keuangan.cetakTagihan(m2);
        keuangan.cetakTagihan(m3);

        jurusan.daftarPraktikum(m3, 1);
        
        jurusan.tampilInfo();
    }
}