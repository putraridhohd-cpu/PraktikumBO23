package MotorEncapsulation;

public class Motor23 {
    private int kecepatan = 0;
    private boolean kontak0n = false;

    public void nyalakanMesin() {
        kontak0n = true;
    }

    public void matikanMesin() {
        kontak0n = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontak0n == true) {
            kecepatan += 5;
        }
        else {
            System.out.println("Kecepatan motor valent tidak bisa nambah karena mesin nya off! \n ");
        }
    }
    
    public void kurangiKecepatan() {
        if (kontak0n = true) {
            kecepatan -= 5;
    }
    else {
        System.out.println("kecepatan motor valent  tidak bisa berurang karena mesin OFF! \n");
    }

    

    }
     public void printStatus() {
        if (kontak0n == true) {
            System.out.println("Kontak 0n");
        }
        else {
            System.out.println("Kontak 0ff");
        }
        System.out.println("kecepatan motor valent = " + kecepatan + "\n");
    }

    
    
}
