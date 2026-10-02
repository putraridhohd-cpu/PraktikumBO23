package Jobsheet6.Percobaan4;

public class ClassC extends ClassB {
    ClassC() {
        System.out.println("konstruktor C dijalankan");
        super(); // MODIFIKASI ERROR: Jika super() diletakkan di baris kedua, Java akan menghasilkan error!
    }
}