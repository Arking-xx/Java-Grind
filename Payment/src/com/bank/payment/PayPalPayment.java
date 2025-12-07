package com.bank.payment;

public class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(String id, double amount, String currency, String email) {
        super(id, amount, currency);
        this.email = email;
    }

    @Override
    public void refund() {
        System.out.println(" Refunding to PayPal: " + email);
    }

    @Override
    public boolean proccessPayment() {
        System.out.println("Processing Paypal: " + email);
        logTransaction();
        return true;
    }
}
