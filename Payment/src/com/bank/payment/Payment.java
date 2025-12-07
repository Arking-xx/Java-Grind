package com.bank.payment;


public abstract class Payment {
    protected String transactionId;
    protected double amount;
    protected String currency;

    public Payment(String transactionId, double amount, String currency) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.currency = currency;
    }

    public void logTransaction() {
        System.out.println("Logging transaction " + transactionId);
        System.out.println("Amount " + amount + " " + currency);
    }

    public abstract boolean proccessPayment();

    public abstract void refund();
}
