package Cobateori.Teori11.Bagian4;

import java.util.Map;

public class DiscountCalculator {
    private Map<String, DiscountPolicy> policies;

    public DiscountCalculator(Map<String, DiscountPolicy> policies) {
        this.policies = policies;
    }

    public int calculate(Customer customer, Order order) {
        DiscountPolicy policy = policies.get(customer.getType());
        if (policy != null) {
            return policy.calculate(order.getAmount());
        }
        return 0; // Tidak ada diskon jika policy tidak ditemukan
    }
}