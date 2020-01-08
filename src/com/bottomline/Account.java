package com.bottomline;

public class Account {
    private float balance;

    public void deposit(float amount){
        if(amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(float amount){
        if(balance > amount) {
            balance -= amount;
        }
    }
    // provide view for encapsulation data using private attributes
    public void setBalance(float balance){
        // ToDo: add exception to warn about negative balance
        if (balance > 0) {
            this.balance = balance;
        }
    }
    // provide view for encapsulation data using private attributes
    public float getBalance(){
        return balance;
    }
}
