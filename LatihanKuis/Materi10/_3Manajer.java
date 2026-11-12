package LatihanKuis.Materi10;

// _3Manajer adalah turunan (subclass) dari _2Pegawai.
// Otomatis mewarisi 'nama', 'gajiPokok', serta kontrak '_1BisaDibayar'.
public class _3Manajer extends _2Pegawai {
    
    // Atribut khusus yang hanya dimiliki Manajer
    private int tunjangan;

    public _3Manajer(String nama, int gajiPokok, int tunjangan) {
        super(nama, gajiPokok); // Mengirim nama & gajiPokok ke constructor induk (_2Pegawai)
        this.tunjangan = tunjangan;
    }

    // DYNAMIC POLYMORPHISM (Method Overriding):
    // Menulis ulang cara menghitung bayaran khusus Manajer (Gaji Pokok + Tunjangan).
    @Override
    public int hitungNominalBayar() {
        return gajiPokok + tunjangan;
    }

    // Method spesifik yang HANYA dimiliki oleh Manajer (tidak ada di _2Pegawai).
    // Nantinya method ini hanya bisa dipanggil setelah dilakukan Downcasting.
    public void pimpinRapat() {
        System.out.println("-> [Tugas Khusus] Manajer " + nama + " sedang memimpin rapat strategis.");
    }
}