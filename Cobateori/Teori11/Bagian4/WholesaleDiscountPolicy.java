package Cobateori.Teori11.Bagian4;

public class WholesaleDiscountPolicy implements DiscountPolicy {
    @Override
    public int calculate(int amount) {
        return amount * 20 / 100; // Diskon 20% sesuai contoh slide
    }
}