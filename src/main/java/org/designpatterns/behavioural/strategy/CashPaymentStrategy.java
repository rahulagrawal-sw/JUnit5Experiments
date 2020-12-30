package org.designpatterns.behavioural.strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean pay(double amount) {
        System.out.println("CashPaymentStrategy : " + amount);
        return true;
    }
}
