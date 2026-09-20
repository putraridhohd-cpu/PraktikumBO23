package Jobsheet4.Cobasaja.Percobaan1;

public class Main {
    public static void main(String[] args) {
        Processor23 p = new Processor23("Intel Core i7", 12.0);
        Laptop23 l = new Laptop23("Asus", p);
        
        l.info();

        Processor23 p1 = new Processor23();
        p1.setMerk("infinix hot 40i");
        p1.setCache(4);
        Laptop23 l1 = new Laptop23();
        l1.setMerk("Zyrex D tech pro V1");
        l1.setProc(p1);
        l1.info();

        Laptop23 l2 = new Laptop23("Thinkpad", new Processor23("intel i5", 3));
        l2.info();


    }
}