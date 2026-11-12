package LatihanKuis.Materi9Lagi;

public class StasiunCharging {
    
    // Parameter bertipe interface 'BisaDiCharge'.
    // Artinya: Objek dari class MANA PUN boleh masuk ke method ini,
    // asalkan class tersebut meng-implements BisaDiCharge.
    public void mulaiCharging(BisaDiCharge perangkat) {
        System.out.print("[Stasiun Charging] ");
        perangkat.isiDaya();
    }
}