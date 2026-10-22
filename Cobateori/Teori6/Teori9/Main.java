package Cobateori.Teori6.Teori9;

public class Main {
    public static void main(String[] args) {
        Hewan[] daftar = { new Kucing("Tom"), new Ikan("Nemo") };
        for (Hewan h : daftar) {
            h.bergerak();
            h.tambahUmur();
        }
    }
}
