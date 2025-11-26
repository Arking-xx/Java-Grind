package com.Overload;

public class MessageSender {
    // valid overloads
    void send(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }

    void send(String phoneNumber, String message, boolean isSms) {
        System.out.println("Sending to " + phoneNumber + ": " + message);
    }

    void send(String[] emails, String message) {
        for (String email : emails) {
            System.out.println("Sending to " + email + ": " + message);
        }
    }

    // not work same with first method
    //    void send(String receiver, String text){
    //
    //    }
}
