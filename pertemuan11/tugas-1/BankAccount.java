public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " setor Rp " + amount + " | Saldo: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " tarik Rp " + amount + " | Saldo: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " gagal tarik Rp " + amount + " (Saldo tidak cukup) | Saldo: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}
