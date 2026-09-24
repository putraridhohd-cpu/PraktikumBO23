package Jobsheet4.TugasMandiri;

public class Menteri23 {
    private String nip;
    private String nama;

    public Menteri23(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    // Dependency: Objek UndangUndang23 hanya digunakan sebagai parameter method
    public void mengesahkanUU(UndangUndang23 uu) {
        System.out.println("Menteri " + nama + " mengesahkan " + uu.getNomor() + " tentang " + uu.getTentang());
    }
}