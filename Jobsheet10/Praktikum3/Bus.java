package Jobsheet10.Praktikum3;

public class Bus extends Kendaraan {
    private int biayaKebersihan;

    // Tambahkan tarifPerJam di parameter agar sama seperti Mobil
    public Bus(String nopol, int tarifPerJam, int biayaKebersihan) {
        // Panggil super dengan DUA parameter
        super(nopol, tarifPerJam); 
        
        this.biayaKebersihan = biayaKebersihan;
    }

    public int getBiayaKebersihan() {
        return biayaKebersihan;
    }
}
