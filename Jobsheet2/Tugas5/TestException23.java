package Jobsheet2.Tugas5;

public class TestException23 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3};

        System.out.println("Awal Program");

        try {
            // Mencoba mengakses indeks yang tidak valid
            System.out.println(angka[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangkap dan menangani error tanpa menghentikan program
            System.out.println("Terjadi error: Indeks array melebihi batas!");
        }

        System.out.println("Akhir Program");
    }
}