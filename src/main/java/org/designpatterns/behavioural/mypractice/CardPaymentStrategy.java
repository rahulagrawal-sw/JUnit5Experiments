package org.designpatterns.behavioural.mypractice;

public class CardPaymentStrategy implements MyPaymentStrategy {

    @Override
    public int pay(int amount) {
        System.out.println("CardPaymentStrategy");
        return amount;
    }
}
