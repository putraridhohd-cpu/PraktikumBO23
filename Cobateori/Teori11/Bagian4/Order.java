package Cobateori.Teori11.Bagian4;

public abstract class Order {
    private String description;
    private int amount;
    
    public Order(String description, int amount) {
        this.description = description;
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public String describe() {
        return description;
    }
}
