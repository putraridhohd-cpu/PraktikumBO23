package Jobsheet10.Praktikum3;

public class Parkir {
    public int hitungBiaya(Kendaraan k, int lamaJam) {
        int biaya = k.getTarifPerJam() * lamaJam;

        // Menggabungkan Pattern Matching (No. 3) dan penambahan Bus (No. 4)
        if (k instanceof Mobil m) {
            biaya += m.getBiayaValet();
        } else if (k instanceof Motor mtr) {
            biaya += mtr.getBiayaHelm();
        } else if (k instanceof Bus b) { // Tambahan percabangan untuk Bus (No. 4)
            biaya += b.getBiayaKebersihan();
        }

        return biaya;
    }
}