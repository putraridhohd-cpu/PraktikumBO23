package MotorEncapsulation;

public class Motor23 {
    public int kecepatan = 0;
    public boolean kontak0n = false;

    public void printStatus() {
        if (kontak0n == true) {
            System.out.println("Kontak 0n");
        }
        else {
            System.out.println("Kontak 0ff");
        }
        System.out.println("kecepatan = " + kecepatan + "\n");
    }
    
}
