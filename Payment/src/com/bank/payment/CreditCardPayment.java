package com.bank.payment;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String id, double amount, String currency, String cardNumber) {
        super(id, amount, currency);
        this.cardNumber = cardNumber;
    }


    @Override
    public boolean proccessPayment() {
        System.out.println("Processing credit card: " + cardNumber);
        logTransaction();
        return true;
    }

    @Override
    public void refund() {
        System.out.println("Refunding to card: " + cardNumber);
    }
}
