package org.designpatterns.behavioural.strategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean pay(double amount) {
        return paymentStrategy.pay(amount);
    }
}
