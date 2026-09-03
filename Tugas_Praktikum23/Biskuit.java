package Tugas_Praktikum23;

public class Biskuit {
    String merek;
    String rasa;

    public Biskuit(String merek, String rasa) {
        this.merek = merek;
        this.rasa = rasa;
    }

    public void bukaBungkus() {
        System.out.println("Membuka kemasan biskuit " + merek);
    }

    public void makan() {
        System.out.println("Mencicipi biskuit " + merek + " rasa " + rasa);
    }

    public void cetakInformasi() {
        System.out.println("Merek Biskuit: " + merek);
        System.out.println("Rasa Biskuit : " + rasa);
    }
}