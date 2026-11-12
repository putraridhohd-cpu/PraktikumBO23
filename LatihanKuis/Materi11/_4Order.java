package LatihanKuis.Materi11;

public abstract class _4Order {
    protected String description;
    protected int amount;

    public _4Order(String description, int amount) {
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