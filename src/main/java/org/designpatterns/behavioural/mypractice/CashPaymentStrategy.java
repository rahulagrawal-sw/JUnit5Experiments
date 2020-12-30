package org.designpatterns.behavioural.mypractice;

public class CashPaymentStrategy implements MyPaymentStrategy {

    @Override
    public int pay(int amount) {
        System.out.println("CashPaymentStrategy");
        return amount;
    }
}
