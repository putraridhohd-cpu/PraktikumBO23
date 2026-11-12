package LatihanKuis.Materi11;

// SINGLE RESPONSIBILITY PRINCIPLE (SRP):
// Kelas ini HANYA mengoordinasikan alur pesanan[cite: 107].
// Ia tidak menyimpan ke DB sendiri dan tidak menghitung diskon sendiri[cite: 108].
public class _9OrderProcessor {
    
    private _7Repository repository;

    // DEPENDENCY INVERSION PRINCIPLE (DIP):
    // Kelas bergantung pada interface (_7Repository), diterima melalui constructor.
    public _9OrderProcessor(_7Repository repository) {
        this.repository = repository;
    }

    public void processOrder(_4Order order, _2DiscountPolicy policy) {
        // 1. Koordinasi hitung diskon
        int discount = (policy != null) ? policy.calculate(order.getAmount()) : 0;
        int total = order.getAmount() - discount;

        // 2. Koordinasi simpan data
        repository.save(order, total);
    }
}