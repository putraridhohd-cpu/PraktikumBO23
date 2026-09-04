package Jobsheet2.Percobaan1;

public class TestMahasiswa {
    public static void main(String[] args) {
        // Objek 1 (Objek pertama)
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Valent";
        mhs1.alamat = "Sidoarjo";
        mhs1.kelas = "2C";
        mhs1.tampilanbiodata();

        System.out.println("-------------------------");

        // Objek 2
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Ridho";
        mhs2.alamat = "Sidoarjo";
        mhs2.kelas = "2C";
        mhs2.tampilanbiodata();

        System.out.println("-------------------------");

        // Objek 3
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Putra santoso";
        mhs3.alamat = "Sidoarjo";
        mhs3.kelas = "2C";
        mhs3.tampilanbiodata();
    }
}