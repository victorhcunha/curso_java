package ProgramExeption.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double initialBalance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(double amountForWithdraw){
        if (amountForWithdraw > withdrawLimit){
            throw new IllegalArgumentException("The amount exceeds withdraw limit");}
        if (amountForWithdraw > balance){
            throw new IllegalArgumentException("Not enough balance");}
        this.setBalance(this.getBalance() - amountForWithdraw);
    }
}
