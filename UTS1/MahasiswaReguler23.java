package UTS1;

class MahasiswaReguler23 extends Mahasiswa23 {
    public MahasiswaReguler23(String nim, String nama, int sks) {
        super(nim, nama, sks);
    }

    @Override
    public int hitungUKT() {
        int uktDasar = 150000 * sks;
        return uktDasar + 500000;
    }

    @Override
    public String getJenis() {
        return "Reguler";
    }
}