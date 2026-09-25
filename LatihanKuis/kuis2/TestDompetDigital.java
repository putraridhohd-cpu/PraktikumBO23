package LatihanKuis.kuis2;

public class TestDompetDigital {
    public static void main(String[] args) {
        // Inisialisasi objek dengan konstruktor berparameter
        DompetDigital dompet = new DompetDigital("Valent", "081234567890", 50000);

        System.out.println("=== DATA AKUN ===");
        System.out.println("Pemilik : " + dompet.getNamaPemilik());
        System.out.println("No. HP  : " + dompet.getNomorHP());
        System.out.println("Saldo   : Rp" + dompet.getSaldo());

        System.out.println("\n=== UJI COBA TOP UP ===");
        dompet.topUp(25000);
        System.out.println("Saldo saat ini: Rp" + dompet.getSaldo());

        System.out.println("\n=== UJI COBA PEMBAYARAN ===");
        // Coba bayar melebihi saldo
        dompet.bayar(100000); 
        
        // Coba bayar sesuai saldo
        dompet.bayar(30000);  
        System.out.println("Saldo akhir: Rp" + dompet.getSaldo());
    }
}