package com.bottomline;

public class Main {

    public static void main(String[] args) {
        // java class
        // it's mechanism to manipulates class attributes using class methods
	    User user = new User("Moshe", 30);
	    System.out.println(user.getUserName());
	    user.sayHello();

	    // interface
        // it's mechanism that ask th derived classes to implement base class behaviour
	    TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

        // encapsulation
        // it's mechanism to operate on class attributes
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

        // abstraction
        // it's mechanism to hide un required details from class user
        var mailService  = new MailService();
        mailService.sendEmail();

        // inheritance
        // it's mechanism to reuse a code
        var textBox = new TextBox();
        textBox.enable();

        // polymorphism
        // single object type can have many forms
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());

        // UML: Unified Modeling Lang


    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }


    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
