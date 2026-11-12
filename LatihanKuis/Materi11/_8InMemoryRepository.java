package LatihanKuis.Materi11;

import java.util.ArrayList;
import java.util.List;

public class _8InMemoryRepository implements _7Repository {
    
    // COLLECTIONS (ArrayList):
    // Digunakan untuk menyimpan data berurutan yang jumlahnya bisa bertambah otomatis.
    private List<_4Order> historyPesanan = new ArrayList<>();

    @Override
    public void save(_4Order order, int total) {
        historyPesanan.add(order);
        System.out.println("[DB Simpan] " + order.describe() + " | Final Bayar: Rp" + total);
    }
}   