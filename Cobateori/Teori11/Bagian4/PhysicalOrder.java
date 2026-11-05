package Cobateori.Teori11.Bagian4;

public class PhysicalOrder extends Order implements Shippable {
    public PhysicalOrder(String description, int amount) {
        super(description, amount);
    }

    @Override
    public String ship() {
        return "Barang fisik dikirim ke alamat pelanggan.";
    }
}
