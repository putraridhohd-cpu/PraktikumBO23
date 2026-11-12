package LatihanKuis.Materi9Lagi;

// 'extends Kendaraan' -> MobilBensin adalah turunan dari Kendaraan.
// 'implements BisaTerhubungGPS' -> MobilBensin menyetujui kontrak kemampuan GPS.
// (MobilBensin tidak meng-implements BisaDiCharge karena mengisi bahan bakar bensin).
public class MobilBensin extends Kendaraan implements BisaTerhubungGPS {

    public MobilBensin(String merk) {
        // Memanggil constructor milik induk (Kendaraan) untuk mengisi atribut 'merk'
        super(merk);
    }

    // WAJIB meng-override abstract method dari induk (Kendaraan), jika lupa akan error saat compile
    @Override
    public void nyalakanMesin() {
        System.out.println(merk + " menyala dengan memutar kunci kontak (suara mesin bensin).");
    }

    // WAJIB meng-override method dari interface BisaTerhubungGPS.
    // Aksesnya WAJIB 'public' karena aturan method interface selalu public.
    @Override
    public void lacakLokasi() {
        System.out.println("GPS Mobil " + merk + ": Sedang melacak rute di jalan raya.");
    }
}