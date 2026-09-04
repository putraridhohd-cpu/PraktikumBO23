package Jobsheet2.Tugas3;

public class MainLingkaran23 {
    public static void main(String[] args) {
        // instansiasi objek dari class lingkaran23
        Lingkaran23 lkr = new Lingkaran23();

        // mbuat isi nilai atribut phi dan r
        lkr.phi = 3.14;
        lkr.r = 7;

        // nampilin hasil perhitungan luas dan keliling
        System.out.println("Jari jari (r)      : " + lkr.r);
        System.out.println("Nilai phi          :" + lkr.phi);
        System.out.println("-------------------------------------");
        System.out.println("Luas Lingkaran     : " + lkr.hitungLuas());
        System.out.println("Keliling Lingkaran : " + lkr.hitungKeliling());
    
}

}
