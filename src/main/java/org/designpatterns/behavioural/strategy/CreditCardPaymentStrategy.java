package org.designpatterns.behavioural.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean pay(double amount) {
        System.out.println("CreditCardPaymentStrategy : " + amount);
        return true;
    }
}
