package org.DecoratorDesignPattern.toppings;

import org.DecoratorDesignPattern.Base.BasePizza;

public class Mushroom extends ToppingDecorator {
    private final BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
