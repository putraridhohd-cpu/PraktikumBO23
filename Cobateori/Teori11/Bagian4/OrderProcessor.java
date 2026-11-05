package Cobateori.Teori11.Bagian4;

public class OrderProcessor {
    private DiscountCalculator discountCalculator;
    private Repository repository;
    private ReceiptPrinter receiptPrinter;

    // Dependency Injection melalui constructor
    public OrderProcessor(DiscountCalculator discountCalculator, 
                          Repository repository, 
                          ReceiptPrinter receiptPrinter) {
        this.discountCalculator = discountCalculator;
        this.repository = repository;
        this.receiptPrinter = receiptPrinter;
    }

    public void processOrder(Customer customer, Order order) {
        int discount = discountCalculator.calculate(customer, order);
        int total = order.getAmount() - discount;
        repository.save(order, total);
        receiptPrinter.print(customer, order, discount, total);
    }
}