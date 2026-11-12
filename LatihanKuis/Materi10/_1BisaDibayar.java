package LatihanKuis.Materi10;

// Interface ini berperan sebagai "kontrak perilaku" lintas hierarki.
// Artinya: Objek dari class MANA PUN (baik pegawai maupun tagihan kantor)
// bisa diproses oleh sistem keuangan asalkan meng-implements interface ini.
public interface _1BisaDibayar {
    
    // Method kontrak: setiap class yang memakai interface ini wajib punya cara menghitung bayarannya.
    int hitungNominalBayar();
}