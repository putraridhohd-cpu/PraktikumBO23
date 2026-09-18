package Cobasaja.Percobaan1;

public class Main {
    public static void main(String[] args) {
        Processor23 p = new Processor23("Intel Core i7", 12.0);
        Laptop23 l = new Laptop23("Asus", p);
        
        l.info();
    }
}