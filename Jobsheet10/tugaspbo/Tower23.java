package Jobsheet10.tugaspbo;

public class Tower23 {

    // Parameter bertipe interface -> polimorfisme: bisa menerima Goblin, Golem, atau Wall
    public void doAttack(Damageable23 d) {
        d.damaged(); // method yang dipanggil ditentukan saat runtime (dynamic dispatch)
    }
}
