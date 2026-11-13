package kuis2;

public class PotonganKomunitas implements SkemaPotongan {
    @Override
    public int hitung(int biayaSewa) {
        return biayaSewa * 15 / 100;
    }
}
