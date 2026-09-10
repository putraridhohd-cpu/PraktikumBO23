package Jobsheet3.MotorEncapsulation;

public class MotorDemo23 {
    public static void main(String[] args) {
        Motor23 motor = new Motor23();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
    
}
