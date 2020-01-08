package com.bottomline;

public class Main {

    public static void main(String[] args) {
        // java class
	    User user = new User("Moshe", 30);
	    System.out.println(user.getUserName());
	    user.sayHello();

	    // interface
	    TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

        // encapsulation
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        // abstraction
        var mailService  = new MailService();
        mailService.sendEmail();


    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
