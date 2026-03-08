package org.WithStrategyPattern;


import org.WithStrategyPattern.Strategy.OnlinePayment;

public class PaymentSystem {
    public static void main(String[] args) {


        ShoppingCart cart = new ShoppingCart(new OnlinePayment());
        cart.MakePayment();
        /*
        * what is strategy pattern adn what we want to achieve with it.
        * 1) remove the duplicate code across child classes which are not present in parent class
        * 2) */

    }
}