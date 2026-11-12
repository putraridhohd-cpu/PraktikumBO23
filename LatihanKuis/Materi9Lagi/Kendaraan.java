package LatihanKuis.Materi9Lagi;

// Kata kunci 'abstract' menandakan class ini hanya sebagai kerangka umum (induk).
// Class ini TIDAK BISA dibuat objeknya secara langsung (new Kendaraan() akan error).
public abstract class Kendaraan {
    
    // Atribut biasa boleh dimiliki oleh abstract class dan diwariskan ke turunannya
    protected String merk;

    // Constructor tetap boleh ada untuk menginisialisasi atribut saat objek turunan dibuat
    public Kendaraan(String merk) {
        this.merk = merk;
    }

    // METHOD KONKRET (Method Biasa):
    // Punya isi kode { }, sehingga langsung diwariskan dan bisa dipakai oleh semua anak class
    public void tampilkanMerk() {
        System.out.println("Merk Kendaraan: " + merk);
    }

    // ABSTRACT METHOD:
    // Hanya deklarasi tanpa isi { } dan diakhiri titik koma (;).
    // Aturan: Setiap class anak WAJIB menuliskan ulang (meng-override) cara kerja method ini.
    public abstract void nyalakanMesin();
}