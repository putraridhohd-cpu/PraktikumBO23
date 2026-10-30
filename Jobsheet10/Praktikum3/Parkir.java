package Jobsheet10.Praktikum3;

public class Parkir {
public int hitungBiaya(Kendaraan k, int lamaJam) {
int biaya = k.getTarifPerJam() * lamaJam;
if (k instanceof Mobil) {
biaya += ((Mobil) k).getBiayaValet();
} else if (k instanceof Motor) {
biaya += ((Motor) k).getBiayaHelm();
}
return biaya;
}
}