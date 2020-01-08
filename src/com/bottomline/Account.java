package com.bottomline;

public class Account {
    private float balance;

    public void setBalance(float balance){
        // ToDo: add exception to warn about negative balance
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public float getBalance(){
        return balance;
    }
}
