package LatihanKuis.Materi11;

// LISKOV SUBSTITUTION & INTERFACE SEGREGATION:
// PhysicalOrder mengimplementasikan Shippable karena memang barang fisik bisa dikirim.
public class _5PhysicalOrder extends _4Order implements _1Shippable {
    public _5PhysicalOrder(String description, int amount) {
        super(description, amount);
    }

    @Override
    public String ship() {
        return "Mengirim paket fisik ke alamat tujuan.";
    }
}