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

        // core object oriented meanings
        var account = new Account();
        account.balance = -1;




    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
