package Jobsheet11;

public class Bank {
    // Dihapus: private Map<String, Account> accounts = new LinkedHashMap<>();
    // Ditambah: Variabel repository yang menggunakan interface AccountRepository
    private AccountRepository repository;

    // Ditambah: Konstruktor sekarang meminta objek yang mengimplementasikan AccountRepository
    public Bank(AccountRepository repository) {
        this.repository = repository;
    }

    public boolean addAccount(Account account) {
        // Diubah: Pengecekan kunci Map diganti dengan pemanggilan findByNumber dari repository
        if (repository.findByNumber(account.getAccountNumber()) != null) {
            return false;
        }
        // Diubah: Menyimpan data menggunakan save dari repository
        repository.save(account);
        return true;
    }

    public Account findAccount(String accountNumber) {
        // Diubah: Mengambil data menggunakan findByNumber dari repository
        return repository.findByNumber(accountNumber);
    }

    public void printAllAccounts() {
        // Diubah: Looping menggunakan findAll dari repository
        for (Account acc : repository.findAll()) {
            acc.printInfo();
        }
    }

    public void printMonthlyFees() {
        // Diubah: Looping menggunakan findAll dari repository
        for (Account acc : repository.findAll()) {
            System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
        }
    }

    public void processMonthEnd() {
        // Diubah: Looping menggunakan findAll dari repository
        for (Account acc : repository.findAll()) {
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }

    public void printHistory(String accountNumber) {
        // Tidak ada yang diubah karena findAccount sudah diperbarui di atas
        Account acc = findAccount(accountNumber);
        if (acc == null) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        for (Transaction t : acc.getHistory()) {
            System.out.println(accountNumber + " " + t);
        }
    }
}