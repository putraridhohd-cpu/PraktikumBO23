package Jobsheet11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bank {
    // Hasil Langkah 1: Menggunakan Map
    private Map<String, Account> accounts = new LinkedHashMap<>();

    // Hasil Langkah 1: Konstruktor tanpa kapasitas
    public Bank() {
    }

    public boolean addAccount(Account account) {
        if (accounts.containsKey(account.getAccountNumber())) {
            return false;
        }
        accounts.put(account.getAccountNumber(), account);
        return true;
    }

    public Account findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void printAllAccounts() {  // cetak laporan rekap
        for (Account acc : accounts.values()) {
            acc.printInfo();
        }
    }

    public void printMonthlyFees() { // biaya admin bulanan nya
        for (Account acc : accounts.values()) {
            System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
        }
    }

    public void processMonthEnd() { // memutar/looping semua rekening,ngecek hak bunga,tambahin ke saldo lalu munculin tagihan biaya admin
        for (Account acc : accounts.values()) {
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    // Hasil Langkah 2: Menambahkan fitur cetak riwayat transaksi
    public void printHistory(String accountNumber) { 
        Account acc = findAccount(accountNumber); // mencari data 
        if (acc == null) { 
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        for (Transaction t : acc.getHistory()) { // ambil riwayat data transaksi (get) dan membaca riwayat degan for
            System.out.println(accountNumber + " " + t); 
        }
    }
}