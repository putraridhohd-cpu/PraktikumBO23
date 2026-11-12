package LatihanKuis.kuis4;

// Class Radio: HANYA me-extends Elektronik, TIDAK me-implements interface apapun
public class Radio extends Elektronik {

    public Radio(String namaPerangkat) {
        super(namaPerangkat);
    }

    // Wajib me-override abstract method dari Elektronik
    @Override
    public void fungsiUtama() {
        System.out.println(namaPerangkat + " digunakan untuk memutar siaran radio FM.");
    }
}