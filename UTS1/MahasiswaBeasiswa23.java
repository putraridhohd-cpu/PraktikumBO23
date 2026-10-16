package UTS1;

class MahasiswaBeasiswa23 extends Mahasiswa23 {
    private int persenBeasiswa;

    public MahasiswaBeasiswa23(String nim, String nama, int sks, int persenBeasiswa) {
        super(nim, nama, sks);
        this.persenBeasiswa = persenBeasiswa;
    }

    @Override
    public int hitungUKT() {
        int uktDasar = 150000 * sks;
        int totalSebelumPotong = uktDasar + 500000;
        return totalSebelumPotong - (totalSebelumPotong * persenBeasiswa / 100);
    }

    @Override
    public String getJenis() {
        return "Beasiswa " + persenBeasiswa + "%";
    }
}