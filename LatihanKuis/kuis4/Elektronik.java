package LatihanKuis.kuis4;

// Abstract Class: Cetak biru induk, TIDAK BISA dibuat objeknya langsung (tidak bisa di-new)
public abstract class Elektronik {
    // Atribut biasa (otomatis diwariskan ke semua class anak)
    protected String namaPerangkat;

    // Constructor untuk inisialisasi nama
    public Elektronik(String namaPerangkat) {
        this.namaPerangkat = namaPerangkat;
    }

    // 1. Method Konkret (Punya Isi): 
    // Langsung diwariskan dan bisa dipakai anak tanpa wajib di-override
    public void nyalakan() {
        System.out.println(namaPerangkat + " sedang dinyalakan...");
    }

    // 2. Abstract Method (Tanpa Isi, diakhiri ';'):
    // WAJIB di-override (diisi jalannya fungsi) oleh semua class anak!
    public abstract void fungsiUtama();
}