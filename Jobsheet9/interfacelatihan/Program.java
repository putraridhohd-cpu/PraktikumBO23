package Jobsheet9.interfacelatihan;

public class Program {
public static void main(String[] args) {
Rektor pakRektor = new Rektor();
Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
Sarjana sarjanaCumlaude = new Sarjana("Dini");
PascaSarjana masterCumlaude = new PascaSarjana("Elok");

// pakRektor.beriSertifikatCumlaude(mhsBiasa);
// pakRektor.beriSertifikatCumlaude(sarjanaCumlaude); kasih komentar
// pakRektor.beriSertifikatCumlaude(masterCumlaude); kasih komentar

// pakRektor.beriSertifikatMawapres(sarjanaCumlaude); kita kasih komentar disini biaar gak error
pakRektor.beriSertifikatMawapres(masterCumlaude);

System.out.println("hasilnya ");
sarjanaCumlaude.kuliahDiKampus();
}
}