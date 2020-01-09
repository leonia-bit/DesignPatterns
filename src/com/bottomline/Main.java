package com.bottomline;

import com.bottomline.memento.Editor;
import com.bottomline.memento.History;

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
        // Design pattern memento using editor undo operation
        var editor = new Editor();
        var history  = new History();

        System.out.println("Start undo test...");
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        history.push(editor.createState());
        editor.setContent("d");
        history.push(editor.createState());

        editor.restore(history.pop());
        editor.restore(history.pop());
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());








    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }


    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
