package Cobateori.Teori11.Bagian4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1. Siapkan Aturan Diskon (Map)[cite: 5]
        Map<String, DiscountPolicy> policies = new HashMap<>();
        policies.put("grosir", new WholesaleDiscountPolicy()); // Diskon 20%[cite: 5]

        // 2. Inisialisasi komponen pendukung[cite: 1, 3]
        DiscountCalculator calculator = new DiscountCalculator(policies);
        
        // Implementasi anonim sederhana untuk Repository (DIP)[cite: 4]
        Repository repository = new Repository() {
            @Override
            public void save(Order order, int total) {
                System.out.println("[Database] Pesanan '" + order.describe() + "' tersimpan dengan total bayar: Rp " + total);
            }
        };
        
        ReceiptPrinter printer = new ReceiptPrinter(); //[cite: 1, 3]

        // 3. Buat koordinator OrderProcessor[cite: 1, 3, 4]
        OrderProcessor processor = new OrderProcessor(calculator, repository, printer);

        // 4. Simulasi Transaksi Pelanggan
        Customer customerGrosir = new Customer("grosir"); // Pelanggan Grosir[cite: 1]
        
        // Pesanan Fisik (PhysicalOrder)[cite: 1, 2]
        PhysicalOrder orderFisik = new PhysicalOrder("Laptop Gaming", 10000000);
        System.out.println("=== Memproses Pesanan Fisik ===");
        System.out.println("Status Pengiriman: " + orderFisik.ship()); //[cite: 2]
        processor.processOrder(customerGrosir, orderFisik); //[cite: 4]

        System.out.println("\n-----------------------------------\n");

        // Pesanan Digital (DigitalOrder)[cite: 1, 2, 5]
        DigitalOrder orderDigital = new DigitalOrder("Lisensi Antivirus", 500000);
        System.out.println("=== Memproses Pesanan Digital ===");
        // orderDigital tidak punya method ship()[cite: 2, 5]
        processor.processOrder(customerGrosir, orderDigital); //[cite: 4]
    }
}