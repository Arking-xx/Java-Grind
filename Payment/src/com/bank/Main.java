package com.bank;

import com.bank.payment.CreditCardPayment;
import com.bank.payment.PayPalPayment;
import com.bank.payment.Payment;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static String id;
    private static double amount;
    private static String currency;

    private static String email;
    private static String cardNumber;

    public static void main(String[] args) {


        displayMenu();
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> {
                System.out.println("Paypal payment");
                payPalPayment();
            }
            case 2 -> {
                System.out.println("Credit card payment");
                creditCardPayment();
            }
            default -> System.out.println("Option doesn't exist");
        }
        scanner.close();

    }

    private static void displayMenu() {
        System.out.println("===Basic Bank====");
        System.out.println("Press " + 1 + " for PayPal option");
        System.out.println("Press " + 2 + " for credit card option");
    }

    private static void payPalPayment() {
        System.out.print("Enter transaction id: ");
        id = scanner.nextLine();

        System.out.print("Enter amount: ");
        amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter currency: ");
        currency = scanner.nextLine();

        System.out.print("Enter email: ");
        email = scanner.nextLine();

        scanner.close();

        Payment paypal = new PayPalPayment(id, amount, currency, email);
        paypal.proccessPayment();
    }

    private static void creditCardPayment() {
        System.out.print("Enter transaction id: ");
        id = scanner.nextLine();

        System.out.print("Enter amount: ");
        amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter currency: ");
        currency = scanner.nextLine();

        System.out.print("Enter card number: ");
        cardNumber = scanner.nextLine();

        scanner.close();

        Payment creditCard = new CreditCardPayment(id, amount, currency, cardNumber);
        creditCard.proccessPayment();
    }
}