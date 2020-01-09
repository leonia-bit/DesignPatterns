package com.bottomline;

// abstract class:
// contain implemented functionality
// contain abstract functions to be implement in derived classes
public abstract class UIControl {
    public void enable(){
        System.out.println("Enable...");
    }
    // no way to implement this functionality
    // because the derived class only know the actual form
    public abstract void draw();

}
