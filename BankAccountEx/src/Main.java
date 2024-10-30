public class Main {
    public static void main(String[] args) {
        BankAccount normalAccount = new BankAccount("Alice", "123456", 40000);
        normalAccount.deposit(20000);
        normalAccount.withdraw(10000);
        System.out.println("Normal Account Balance: " + normalAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("Bob", "789012", 80000, 0.05); // 5% annual interest
        savingsAccount.deposit(15000);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Monthly Interest: " + savingsAccount.calculateMonthlyInterest());
        savingsAccount.withdraw(10000); // Should not be allowed
    }
}