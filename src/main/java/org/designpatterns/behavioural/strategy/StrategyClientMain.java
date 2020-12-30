package org.designpatterns.behavioural.strategy;

/**
 * Strategy Pattern
 * Also called Policy Pattern
 * Whenever client changes the strategy at runtime depending upon current scenario
 * e.g. CounterStrike Game, Payment Methods
 */
public class StrategyClientMain {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPaymentStrategy());
        boolean result = paymentContext.pay(100d);
        System.out.println("CreditCard Result:" + result);

        paymentContext.setPaymentStrategy(new CashPaymentStrategy());
        result = paymentContext.pay(10d);
        System.out.println("Cash Result:" + result);
    }
}
