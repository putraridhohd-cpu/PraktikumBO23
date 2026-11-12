package LatihanKuis.Materi9Lagi;

// Powerbank BUKAN turunan Kendaraan (tidak masuk akal jika Powerbank extends Kendaraan).
// Namun, Powerbank tetap bisa meng-implements BisaDiCharge karena memiliki kemampuan yang sama.
public class Powerbank implements BisaDiCharge {
    private int kapasitas;

    public Powerbank(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    @Override
    public void isiDaya() {
        System.out.println("Powerbank (" + kapasitas + " mAh) sedang di-charge (Tegangan: " + TEGANGAN_STANDAR + "V).");
    }
}