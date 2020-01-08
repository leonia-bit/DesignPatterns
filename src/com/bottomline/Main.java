package com.bottomline;

public class Main {

    public static void main(String[] args) {
        // first java class with one attribute and one method
	    User user = new User("Moshe", 30);
	    System.out.println(user.getUserName());
	    user.sayHello();

	    // first java interface that calculate tax for diff years
	    TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

        // core object oriented concept: encapsulation
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        // core object oriented concept: abstraction : reduce complexity

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
