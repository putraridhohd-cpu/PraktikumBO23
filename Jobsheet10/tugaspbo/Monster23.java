package Jobsheet10.tugaspbo;

// Abstract class: induk Goblin dan Golem, memaksa subclass mengimplementasikan heal() dan damaged()
public abstract class Monster23 implements Damageable23 {
    protected int health;
    protected int level;

    public abstract void heal();

    @Override
    public abstract void damaged();

    public String getMonsterInfo() {
        return "Health = " + health + "\nLevel = " + level + "\n";
    }
}
