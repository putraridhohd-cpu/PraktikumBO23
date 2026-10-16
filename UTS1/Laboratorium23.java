package UTS1;

class Laboratorium23 {
    private String kode;
    private Mahasiswa23[] peserta;
    private int jumlah;
    private int kapasitas;

    public Laboratorium23(String kode, int kapasitas) {
        this.kode = kode;
        this.kapasitas = kapasitas;
        this.peserta = new Mahasiswa23[kapasitas];
        this.jumlah = 0;
    }

    public boolean isPenuh() {
        return jumlah >= kapasitas;
    }

    public boolean tambahPeserta(Mahasiswa23 m) {
        if (!isPenuh()) {
            peserta[jumlah] = m;
            jumlah++;
            return true;
        }
        return false;
    }

    public void tampilPeserta() {
        System.out.print(kode + ": ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(peserta[i].getNama());
            if (i < jumlah - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public String getKode() {
        return kode;
    }
}