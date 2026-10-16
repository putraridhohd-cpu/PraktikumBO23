package UTS1; 

class BagianKeuangan23 {
    private String nama;
    public BagianKeuangan23(String nama) {
        this.nama = nama;
    }
    public void cetakTagihan(Mahasiswa23 m) {
        if (m == null) return;
        String jenis = m.getJenis();
        String namaWali = (m.getDosenWali() != null) ? m.getDosenWali().getNama() : "-";
        System.out.println("Tagihan UKT " + m.getNama() + " (" + jenis + ") - wali: " + namaWali + " : " + m.hitungUKT());
    }
}