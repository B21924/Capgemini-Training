import java.util.ArrayList;
import java.util.List;

class DigitalWallet {

    private double walletBalance;
    private double dailyLimit;
    private long linkedBankAccount;
    private List<String> transactionHistory;

    public DigitalWallet(long linkedBankAccount) {
        this.linkedBankAccount = linkedBankAccount;
        this.walletBalance = 0;
        this.dailyLimit = 0;
        this.transactionHistory = new ArrayList<>();
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            walletBalance += amount;
            transactionHistory.add("Added Rs." + amount);
            System.out.println("Money added successfully");
        }
    }

    public void setDailyLimit(double limit) {
        if (limit > 0) {
            dailyLimit = limit;
            transactionHistory.add("Daily limit set to Rs." + limit);
            System.out.println("Daily limit updated");
        }
    }

    public void transferMoney(double amount) {

        if (amount > dailyLimit) {
            System.out.println("Daily limit exceeded → Transfer failed");
            transactionHistory.add("Transfer of Rs." + amount + " failed (limit exceeded)");
            return;
        }

        if (amount > walletBalance) {
            System.out.println("Insufficient balance → Transfer failed");
            transactionHistory.add("Transfer of Rs." + amount + " failed (insufficient balance)");
            return;
        }

        walletBalance -= amount;
        transactionHistory.add("Transferred Rs." + amount);
        System.out.println("Transfer successful");
    }

    public double checkBalance() {
        return walletBalance;
    }

    public void viewTransactionHistory() {
        System.out.println("Transaction History:");
        for (int i = 0; i < transactionHistory.size(); i++) {
            System.out.println(transactionHistory.get(i));
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        DigitalWallet wallet = new DigitalWallet(1234567);

      
        wallet.transferMoney(6000);

     
        System.out.println("Wallet balance remains unchanged");
        System.out.println("Transaction marked as failed");

        //wallet.viewTransactionHistory();
    }
}
