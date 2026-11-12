package LatihanKuis.Materi11;

// OPEN/CLOSED PRINCIPLE (OCP):
// Interface ini memungkinkan kita menambah jenis diskon baru tanpa mengubah kode yang sudah ada[cite: 77, 109].
public interface _2DiscountPolicy {
    int calculate(int amount);
}