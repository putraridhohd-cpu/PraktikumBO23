package LatihanKuis.Materi11;

// LISKOV SUBSTITUTION PRINCIPLE (LSP):
// DigitalOrder TIDAK implements Shippable. 
// Hal ini mencegah adanya method ship() palsu yang mengembalikan "N/A" atau melempar error.
public class _6DigitalOrder extends _4Order {
    public _6DigitalOrder(String description, int amount) {
        super(description, amount);
    }
    // Tidak ada method ship() di sini.
}