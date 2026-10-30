package Jobsheet10.Praktikum3;

public class Mobil extends Kendaraan {
private int biayaValet;
public Mobil(String platNomor, int tarifPerJam, int biayaValet) {
super(platNomor, tarifPerJam);
this.biayaValet = biayaValet;
}
@Override
public int getTarifPerJam() {
return tarifPerJam;
}
public int getBiayaValet() {
return biayaValet;
}
}