package org.WithStrategyPattern;

import org.WithStrategyPattern.Strategy.PaymentStrategy;

public class ShoppingCart {

    PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy driveStrategy) {
        this.paymentStrategy = driveStrategy;
    }

    public void MakePayment() {
        paymentStrategy.pay();
    }
}
