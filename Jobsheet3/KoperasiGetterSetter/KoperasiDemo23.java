package Jobsheet3.KoperasiGetterSetter;

public class KoperasiDemo23 {
    public static void main(String[] args) {
        Anggota23 anggota1 = new Anggota23();
        anggota1.setNama("Valent Ridho Putra Santoso");
        anggota1.setAlamat("Perumahan permata kebonagung sukodono sidoarjo");
        anggota1.setor(100000);
        System.out.println("Simpanan" + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan" + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
        
    }
    
}
