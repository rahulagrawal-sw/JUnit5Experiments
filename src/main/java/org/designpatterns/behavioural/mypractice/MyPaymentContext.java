package org.designpatterns.behavioural.mypractice;

public class MyPaymentContext {

    private MyPaymentStrategy myPaymentStrategy;

    public MyPaymentStrategy getMyPaymentStrategy() {
        return myPaymentStrategy;
    }

    public void setMyPaymentStrategy(MyPaymentStrategy myPaymentStrategy) {
        this.myPaymentStrategy = myPaymentStrategy;
    }

    public int pay(int amount) {
        return myPaymentStrategy.pay(amount);
    }
}
