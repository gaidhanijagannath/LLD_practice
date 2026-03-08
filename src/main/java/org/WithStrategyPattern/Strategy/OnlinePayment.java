package org.WithStrategyPattern.Strategy;

public class OnlinePayment implements PaymentStrategy {
    @Override
    public void pay() {

        System.out.println("Online QR payment");
    }
}
