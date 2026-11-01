package Jobsheet10.tugaspbo;

public class Wall23 implements Damageable23 {
    private int durability;

    public Wall23(int durability) {
        this.durability = durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public void damaged() {
        durability -= 8;
    }

    public String getWallInfo() {
        return "Wall Durability = " + durability + "\n";
    }
}
