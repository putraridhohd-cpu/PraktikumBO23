package Jobsheet10.Praktikum1Dan2;

public class Tester1 {
public static void main(String[] args) {
RegularStudent rStd = new RegularStudent("Rina", 400);
ScholarshipStudent sStd = new ScholarshipStudent("Bayu", "KIP Kuliah");
LabRental lab = new LabRental(3, "LAB-JARINGAN");
Student s;
Billable b;
s = rStd; // Sah! RegularStudent is-a Student
s = sStd; // Sah! ScholarshipStudent is-a Student
b = rStd; // Sah! RegularStudent implements Billable
b = lab; // Sah! LabRental implements Billable
// Uji baris yang memicu error kompilasi (hilangkan komentar untuk menguji):
// s = lab; // Error! LabRental bukan turunan Student
// b = sStd; // Error! ScholarshipStudent tidak implements Billable
}
}