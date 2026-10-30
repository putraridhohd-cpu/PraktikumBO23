package Jobsheet10.Praktikum1Dan2;

public class Tester2 {
public static void main(String[] args) {
RegularStudent rStd = new RegularStudent("Rina", 400);
Student s;
s = rStd; // Upcasting referensi
// Pemanggilan method melalui referensi Student:
System.out.println("" + s.getStudentInfo());
System.out.println("--------------------");
// Pemanggilan method melalui referensi RegularStudent:
System.out.println("" + rStd.getStudentInfo());
}
}
