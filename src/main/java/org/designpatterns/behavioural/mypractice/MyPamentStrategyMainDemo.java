package org.designpatterns.behavioural.mypractice;

public class MyPamentStrategyMainDemo {

    public static void main(String[] args) {
        MyPaymentContext myPaymentContext = new MyPaymentContext();
        myPaymentContext.setMyPaymentStrategy(new CardPaymentStrategy());
        myPaymentContext.pay(100);

        myPaymentContext.setMyPaymentStrategy(new CashPaymentStrategy());
        myPaymentContext.pay(200);
    }
}
