/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmbank;

/**
 *
 * @author CSHS-PC105
 */
public class Bank {
        private BankAccount account;

    public Bank(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) throws Exception {

        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be greater than 0.");
        }

        account.setBalance(account.getBalance() + amount);

    }

    public void withdraw(double amount) throws Exception {

        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be greater than 0.");
        }

        if (amount > account.getBalance()) {
            throw new InvalidTransactionException("Insufficient Balance.");
        }

        account.setBalance(account.getBalance() - amount);

    }

    public double checkBalance() throws Exception {
        return account.getBalance();
    }

    public void resetAccount() throws Exception {
        account.setBalance(0);
    }

    
}
