package LatihanKuis.Materi11;

import java.util.HashMap;
import java.util.Map;

public class _10MainSolid {
    public static void main(String[] args) {
        System.out.println("=== SETUP COLLECTIONS MAP ===");
        // COLLECTIONS (Map):
        // Mencari nilai langsung lewat kunci tanpa perlu if-else atau perulangan.
        Map<String, _2DiscountPolicy> daftarDiskon = new HashMap<>();
        daftarDiskon.put("WHOLESALE", new _3WholesaleDiscount());
        daftarDiskon.put("REGULAR", null); // Tidak ada diskon

        System.out.println("=== SETUP DEPENDENCY INVERSION ===");
        // Menyuntikkan repository (In-Memory) ke dalam OrderProcessor[cite: 98].
        _7Repository repo = new _8InMemoryRepository();
        _9OrderProcessor kasir = new _9OrderProcessor(repo);

        System.out.println("\n=== PEMROSESAN PESANAN ===");
        
        // Skenario 1: Pesanan Fisik dengan Diskon Grosir
        _4Order pesanan1 = new _5PhysicalOrder("Laptop Gaming", 15000000);
        _2DiscountPolicy diskon1 = daftarDiskon.get("WHOLESALE");
        kasir.processOrder(pesanan1, diskon1);
        
        // Pengecekan Aman (LSP & ISP) menggunakan Pattern Matching Java[cite: 88]
        if (pesanan1 instanceof _1Shippable s) {
            System.out.println("-> Aksi: " + s.ship());
        }

        System.out.println();

        // Skenario 2: Pesanan Digital (Tanpa Diskon)
        _4Order pesanan2 = new _6DigitalOrder("Lisensi Antivirus", 500000);
        _2DiscountPolicy diskon2 = daftarDiskon.get("REGULAR");
        kasir.processOrder(pesanan2, diskon2);

        // DigitalOrder tidak akan masuk blok if ini karena ia bukan Shippable (Tidak mengingkari janji)[cite: 106].
        if (pesanan2 instanceof _1Shippable s) {
            System.out.println("-> Aksi: " + s.ship());
        }
    }
}