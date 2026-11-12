package LatihanKuis.Materi10;

// Tagihan Internet BUKAN turunan _2Pegawai (tidak masuk akal jika tagihan WiFi dianggap pegawai).
// Namun karena meng-implements _1BisaDibayar, objek ini tetap bisa masuk ke daftar pembayaran kantor!
public class _5TagihanInternet implements _1BisaDibayar {
    
    private String namaProvider;
    private int biayaBulanan;

    public _5TagihanInternet(String namaProvider, int biayaBulanan) {
        this.namaProvider = namaProvider;
        this.biayaBulanan = biayaBulanan;
    }

    public String getNamaProvider() {
        return namaProvider;
    }

    // Implementasi kontrak _1BisaDibayar versi Tagihan Internet
    @Override
    public int hitungNominalBayar() {
        return biayaBulanan;
    }
}