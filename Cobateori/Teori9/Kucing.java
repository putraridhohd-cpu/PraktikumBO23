package Cobateori.Teori9;

public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan dengan 4 kaki");
    }
}
