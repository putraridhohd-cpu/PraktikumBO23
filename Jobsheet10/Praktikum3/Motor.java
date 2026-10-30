package Jobsheet10.Praktikum3;

public class Motor extends Kendaraan {
private int biayaHelm;
public Motor(String platNomor, int tarifPerJam, int biayaHelm) {
super(platNomor, tarifPerJam);
this.biayaHelm = biayaHelm;
}
@Override
public int getTarifPerJam() {
return tarifPerJam;
}
public int getBiayaHelm() {
return biayaHelm;
}
}