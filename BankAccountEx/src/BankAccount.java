public class BankAccount {

    private static final double MIN_BALANCE = 50000.0;
    private String accountName;
    private String accountNumber;
    protected double balance;

    public BankAccount(String ownerName, String accountNumber, double balance) {
        this.accountName = ownerName;
        this.accountNumber = accountNumber;
        if(balance < MIN_BALANCE){
            System.out.println("Insufficient Balance");
        }
        else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        double fee = 5000.0; // Withdrawal fee of VND 5,000
        if (amount > 0 && balance - amount - fee >= MIN_BALANCE) {
            balance -= (amount + fee);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double annualInterestRate;

    public SavingsAccount(String ownerName, String accountNumber, double initialBalance, double annualInterestRate) {
        super(ownerName, accountNumber, initialBalance);
        this.annualInterestRate = annualInterestRate;
    }

    public double calculateMonthlyInterest() {
        return balance * (annualInterestRate / 12);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed from a savings account");
    }
}
