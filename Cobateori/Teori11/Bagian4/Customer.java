package Cobateori.Teori11.Bagian4;

public class Customer {
    private String type; // contoh: "reguler", "grosir"
    
    public Customer(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
}