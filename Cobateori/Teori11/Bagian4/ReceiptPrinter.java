package Cobateori.Teori11.Bagian4;

public class ReceiptPrinter {
    public void print(Customer customer, Order order, int discount, int total) {
        System.out.println("--- Struk Pesanan ---");
        System.out.println("Pesanan: " + order.describe());
        System.out.println("Total Awal: " + order.getAmount());
        System.out.println("Diskon: " + discount);
        System.out.println("Total Bayar: " + total);
    }
}
