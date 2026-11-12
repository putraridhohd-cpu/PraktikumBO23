package LatihanKuis.Materi10;

// Superclass (induk) bagi semua jenis pegawai, sekaligus menyetujui kontrak _1BisaDibayar.
public class _2Pegawai implements _1BisaDibayar {
    
    // Gunakan 'protected' agar atribut bisa diwariskan ke class anak (_3Manajer & _4Programmer)
    protected String nama;
    protected int gajiPokok;

    public _2Pegawai(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    // Implementasi dasar dari interface _1BisaDibayar.
    // Method ini nanti akan di-OVERRIDE (ditulis ulang) oleh class anak sesuai tunjangan/bonusnya.
    @Override
    public int hitungNominalBayar() {
        return gajiPokok;
    }
}