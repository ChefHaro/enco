/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmbank;

/**
 *
 * @author CSHS-PC105
 */
public class BankAccount {
     private double balance;

    public BankAccount() {
        balance = 1000;
    }

    public double getBalance() throws Exception {
        return balance;
    }

    public void setBalance(double balance) throws Exception {
        this.balance = balance;
    }
}
