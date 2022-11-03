package Opgave1BankAccount;

/**
 * Modeller en person
 */

public class BankAccount {
    private double balance;

    private int accountNumber;

    private static int id;

    private int accountCreated;

    /**
     * Initialiserer en ny bank konto med balance.
     *
     * @param initialBalance kontoens saldo
     *                       Pre: saldo &gt; = 0
     */
    public BankAccount(double initialBalance, int id, int initialAccountNumber, int initialaccountCreated) {
        balance = initialBalance;
        accountNumber = initialAccountNumber;
        BankAccount.id++;
        accountNumber = BankAccount.id;
        accountCreated = initialaccountCreated;
        accountCreated++;


    }

    /**
     * Sætter flere penge ind i konto
     * Pre: amount &gt = 0
     *
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Trækker penge fra balance
     * Pre: amount må ikke være højere end saldo på konti
     *
     * @param amount
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Returnerer bankens saldo
     *
     * @return på kontoens saldo
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returnerer kontoens id
     *
     * @param id
     * @return id på kontoen
     */
    private static int getId(int id) {
        return id;


    }

    /**
     * Returnerer hvor mange konto der er lavet
     * @return kontoer lavet
     */

    private int getaccountCreated() {
        return accountCreated;

    }
}











