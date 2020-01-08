package com.bottomline;

// illustrate OOP abstraction concept
// abstraction: reduce complexity meaning hide the un required details
public class MailService {
    // illustrate abstraction: only method available to user, other methods hided means private
    public void sendEmail(){
        connect();
        authenticate();
        // send email
        disconnect();
    }
    // illustrate abstraction: private: hiding un required details from class user
    private void connect(){
        System.out.println("Connect...");
    }
    // illustrate abstraction: private: hiding un required details from class user
    private void disconnect(){
        System.out.println("Disconnect...");
    }
    // illustrate abstraction: private: hiding un required details from class user
    private void authenticate(){
        System.out.println("Authenticate");
    }
}
