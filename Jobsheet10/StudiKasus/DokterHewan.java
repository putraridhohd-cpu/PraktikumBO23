package Jobsheet10.StudiKasus;

public class DokterHewan {
    public void PeriksaHewan(Hewan x) { 
        if (x instanceof Kucing) {
             System.out.println("Kucing diperiksa di atas meja periksa");
             ((Kucing) x).TampilkanCakar();
}
else if (x instanceof Burung) {
    System.out.println("Burung diperiksa di dalam sangkar");
((Burung) x).TampilkanSayap();
}
System.out.println("Makanan yang dianjurkan: " + x.Makanan);
}
}