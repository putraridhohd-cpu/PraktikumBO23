package LatihanKuis.Materi10;

// _4Programmer juga merupakan turunan (subclass) dari _2Pegawai.
public class _4Programmer extends _2Pegawai {
    
    // Atribut khusus yang hanya dimiliki Programmer
    private int bonusLembur;

    public _4Programmer(String nama, int gajiPokok, int bonusLembur) {
        super(nama, gajiPokok);
        this.bonusLembur = bonusLembur;
    }

    // DYNAMIC POLYMORPHISM (Method Overriding):
    // Bentuk kedua dari method hitungNominalBayar() versi Programmer (Gaji Pokok + Bonus Lembur).
    @Override
    public int hitungNominalBayar() {
        return gajiPokok + bonusLembur;
    }

    // Method spesifik yang HANYA dimiliki oleh Programmer.
    public void ngodingFitur() {
        System.out.println("-> [Tugas Khusus] Programmer " + nama + " sedang memperbaiki bug sistem.");
    }
}