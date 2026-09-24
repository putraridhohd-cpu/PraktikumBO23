package Jobsheet4.TugasMandiri;

public class MainTugas23 {
    public static void main(String[] args) {
        Menteri23 menteri = new Menteri23("19701123 199903 1 006", "Suahasil Nazara.");
        Kementerian23 kementerian = new Kementerian23("Kementerian Keuangan", 2);

        kementerian.setMenteri(menteri);
        kementerian.tampilkanInfo();

        System.out.println();

        UndangUndang23 uu = new UndangUndang23("UU No. 12 Tahun 2024", "APBN");
        menteri.mengesahkanUU(uu);
    }
}