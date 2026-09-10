package MotorEncapsulation;

public class Motor23 {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan + 5 <= 100) { // diset kecepatan nya ke 99!
                kecepatan += 5;
            } else {
                kecepatan = 100;
                System.out.println("Kecepatan mencapai batas maksimal (100 km/jam)! \n");
            }
        } else {
            System.out.println("Kecepatan motor valent tidak bisa nambah karena mesin nya off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) { 
            if (kecepatan - 5 >= 0) {
                kecepatan -= 5;
            } else {
                kecepatan = 0;
            }
        } else {
            System.out.println("Kecepatan motor valent tidak bisa berkurang karena mesin OFF! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan motor valent = " + kecepatan + "\n");
    }
}