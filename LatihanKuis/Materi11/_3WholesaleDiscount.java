package LatihanKuis.Materi11;

// Menambah diskon grosir cukup dengan membuat class baru, bukan menambah if-else[cite: 80, 110].
public class _3WholesaleDiscount implements _2DiscountPolicy {
    @Override
    public int calculate(int amount) {
        return amount * 20 / 100; // Diskon 20%
    }
}