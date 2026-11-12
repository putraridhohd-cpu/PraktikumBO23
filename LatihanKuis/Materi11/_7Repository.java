package LatihanKuis.Materi11;

// DEPENDENCY INVERSION PRINCIPLE (DIP):
// Abstraksi (interface) untuk penyimpanan. OrderProcessor akan bergantung pada ini, bukan class asli.
public interface _7Repository {
    void save(_4Order order, int total);
}