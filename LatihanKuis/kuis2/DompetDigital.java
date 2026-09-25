package LatihanKuis.kuis2;

public class DompetDigital {
    private String namaPemilik;
    private String nomorHP;
    private double saldo;

    // Konstruktor berparameter
    public DompetDigital(String namaPemilik, String nomorHP, double saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.nomorHP = nomorHP;
        
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak boleh minus! Set saldo otomatis ke 0.");
        }
    }

    // Getter Method
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method Transaksi 1: Top Up
    public void topUp(double nominal) {
        if (nominal > 0) {
            saldo += nominal;
            System.out.println("Top up berhasil sebesar Rp" + nominal);
        } else {
            System.out.println("Gagal! Nominal top up harus lebih dari 0.");
        }
    }

    // Method Transaksi 2: Pembayaran
    public void bayar(double nominal) {
        if (nominal <= 0) {
            System.out.println("Gagal! Nominal pembayaran tidak valid.");
        } else if (nominal > saldo) {
            System.out.println("Gagal! Saldo tidak mencukupi untuk melakukan pembayaran.");
        } else {
            saldo -= nominal;
            System.out.println("Pembayaran berhasil sebesar Rp" + nominal);
        }
    }
}