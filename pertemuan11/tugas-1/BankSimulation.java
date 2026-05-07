public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000);
        System.out.println("Saldo awal: " + account.getBalance());

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                account.deposit(1000);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "thread A");

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                account.withdraw(1000);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "thread B");

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("-------------------------");
        System.out.println("Saldo akhir: " + account.getBalance());
    }
}
