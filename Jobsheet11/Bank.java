package Jobsheet11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bank {
    // Mengganti Account[] dan count menjadi Map
    private Map<String, Account> accounts = new LinkedHashMap<>();

    // Konstruktor kini tidak memerlukan parameter kapasitas
    public Bank() {
    }

    public boolean addAccount(Account account) {
        // Cek apakah nomor rekening sudah ada
        if (accounts.containsKey(account.getAccountNumber())) {
            return false;
        }
        accounts.put(account.getAccountNumber(), account);
        return true;
    }

    public Account findAccount(String accountNumber) {
        // Pencarian langsung menggunakan key (nomor rekening)
        return accounts.get(accountNumber);
    }

    public void printAllAccounts() {
        // Looping menggunakan accounts.values()
        for (Account acc : accounts.values()) {
            acc.printInfo();
        }
    }

    public void printMonthlyFees() {
        // Looping menggunakan accounts.values()
        for (Account acc : accounts.values()) {
            System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
        }
    }

    public void processMonthEnd() {
        // Looping menggunakan accounts.values()
        for (Account acc : accounts.values()) {
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }
}