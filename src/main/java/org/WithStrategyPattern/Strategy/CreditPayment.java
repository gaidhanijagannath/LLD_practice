package org.WithStrategyPattern.Strategy;

public class CreditPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Making payment via credit card");
    }
}
