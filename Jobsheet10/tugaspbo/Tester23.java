package Jobsheet10.tugaspbo;

public class Tester23 {
    public static void main(String[] args) {
        Goblin23 gb = new Goblin23(120, 1);
        Golem23 gl = new Golem23(150, 2);
        Wall23 w = new Wall23(100);
        Tower23 t = new Tower23();

        System.out.println("" + gb.getMonsterInfo());
        System.out.println("" + gl.getMonsterInfo());
        System.out.println("" + w.getWallInfo());
        System.out.println("------------------------");

        for (int i = 0; i < 4; i++) {
            t.doAttack(gb);
            t.doAttack(gl);
            t.doAttack(w);
        }

        System.out.println("" + gb.getMonsterInfo());
        System.out.println("" + gl.getMonsterInfo());
        System.out.println("" + w.getWallInfo());
        System.out.println("------------------------");

        // Monster melakukan regenerasi setelah diserang
        gb.heal();
        gl.heal();

        System.out.println("" + gb.getMonsterInfo());
        System.out.println("" + gl.getMonsterInfo());
    }
}
