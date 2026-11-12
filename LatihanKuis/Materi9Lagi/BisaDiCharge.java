package LatihanKuis.Materi9Lagi;

// Interface adalah "kontrak kemampuan" (hubungan BISA / can-do).
// Sama seperti abstract class, interface juga tidak bisa di-new.
public interface BisaDiCharge {
    
    // Atribut di dalam interface otomatis bersifat konstanta (public static final),
    // artinya nilainya tetap dan tidak bisa diubah-ubah.
    int TEGANGAN_STANDAR = 220;

    // Method di dalam interface otomatis bersifat 'public abstract'.
    // Cukup tulis nama method-nya tanpa { }.
    void isiDaya();
}