package LatihanKuis.Materi9Lagi;

// Contoh penggabungan 'extends' dan 'implements' lebih dari satu interface (dipisah koma).
// Urutannya wajib: 'extends' dulu (maksimal 1 class), baru 'implements' (boleh banyak interface).
public class SepedaListrik extends Kendaraan implements BisaDiCharge, BisaTerhubungGPS {

    public SepedaListrik(String merk) {
        super(merk);
    }

    // Implementasi method abstract dari class Kendaraan
    @Override
    public void nyalakanMesin() {
        System.out.println(merk + " menyala secara senyap dengan menekan tombol power.");
    }

    // Implementasi method dari interface pertama (BisaDiCharge)
    @Override
    public void isiDaya() {
        // Konstanta TEGANGAN_STANDAR dari interface BisaDiCharge bisa langsung dipakai di sini
        System.out.println("Sepeda Listrik " + merk + " sedang di-charge (Tegangan: " + TEGANGAN_STANDAR + "V).");
    }

    // Implementasi method dari interface kedua (BisaTerhubungGPS)
    @Override
    public void lacakLokasi() {
        System.out.println("GPS Sepeda Listrik " + merk + ": Terparkir aman di area kampus.");
    }
}