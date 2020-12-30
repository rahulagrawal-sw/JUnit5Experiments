package org.designpatterns.behavioural.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

    @Override
    public boolean pay(double amount) {
        System.out.println("DebitCardPaymentStrategy : " + amount);
        return true;
    }
}
