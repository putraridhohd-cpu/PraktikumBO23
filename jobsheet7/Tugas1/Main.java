package jobsheet7.Tugas1;

public class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total Sudut (1 parameter): " + s.totalSudut(90));
        System.out.println("Total Sudut (2 parameter): " + s.totalSudut(90, 45));
        System.out.println("----------------------------------");
        System.out.println("Keliling Segitiga (3 parameter): " + s.keliling(10, 20, 30));
        System.out.println("Keliling Segitiga (2 parameter): " + s.keliling(3, 4));
    }
}