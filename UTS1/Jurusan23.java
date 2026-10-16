package UTS1; 

class Jurusan23 {
    private String nama;
    private Laboratorium23[] daftarlab;
    private int jumlahlab;
    private Dosen23 kajur;

    public Jurusan23(String nama, int jumlahlab, int kapasitaslab) {
        this.nama = nama;
        this.jumlahlab = jumlahlab;
        this.daftarlab = new Laboratorium23[jumlahlab];
        for (int i = 0; i < jumlahlab; i++) {
            this.daftarlab[i] = new Laboratorium23("LAB-" + (i + 1), kapasitaslab);
        }
    }

    public void setKajur(Dosen23 kajur) {
        this.kajur = kajur;
    }

    public void daftarPraktikum(Mahasiswa23 m) {
        if (m == null) return;

        boolean terdaftar = false;
        for (int i = 0; i < jumlahlab; i++) {
            if (!daftarlab[i].isPenuh()) {
                daftarlab[i].tambahPeserta(m);
                terdaftar = true;
                break;
            }
        }
        if (!terdaftar) {
            System.out.println("Semua lab penuh, " + m.getNama() + " tidak dapat didaftarkan.");
        }
    }

    public void daftarPraktikum(Mahasiswa23 m, int nomorlab) {
        if (m == null) return;

        int index = nomorlab - 1;
        if (index < 0 || index >= jumlahlab) {
            System.out.println("Nomor lab tidak valid.");
            return;
        }

        if (daftarlab[index].isPenuh()) {
            System.out.println(daftarlab[index].getKode() + " penuh, " + m.getNama() + " tidak dapat didaftarkan.");
        } else {
            daftarlab[index].tambahPeserta(m);
        }
    }

    public void tampilInfo() {
        for (int i = 0; i < jumlahlab; i++) {
            daftarlab[i].tampilPeserta();
        }
    }
}