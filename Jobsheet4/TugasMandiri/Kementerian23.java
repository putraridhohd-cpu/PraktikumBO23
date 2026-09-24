package Jobsheet4.TugasMandiri;

public class Kementerian23 {
    private String namaKementerian;
    private Menteri23 menteri; // Aggregation
    private Departemen23[] arrayDepartemen; // Composition

    public Kementerian23(String namaKementerian, int jumlahDepartemen) {
        this.namaKementerian = namaKementerian;
        this.arrayDepartemen = new Departemen23[jumlahDepartemen];
        this.initDepartemen();
    }

    // Composition: Dibuat internal di dalam constructor
    private void initDepartemen() {
        for (int i = 0; i < arrayDepartemen.length; i++) {
            this.arrayDepartemen[i] = new Departemen23("Sub-Bidang " + (i + 1));
        }
    }

    // Aggregation: Diterima dari luar via setter
    public void setMenteri(Menteri23 menteri) {
        this.menteri = menteri;
    }

    public void tampilkanInfo() {
        System.out.println("=== " + namaKementerian + " ===");
        if (menteri != null) {
            System.out.println("Menteri: " + menteri.getNama() + " (NIP: " + menteri.getNip() + ")");
        } else {
            System.out.println("Menteri: Belum ditunjuk");
        }
        System.out.println("Daftar Departemen/Sub-Bidang:");
        for (Departemen23 dep : arrayDepartemen) {
            System.out.println("- " + dep.getNamaDepartemen());
        }
    }
}