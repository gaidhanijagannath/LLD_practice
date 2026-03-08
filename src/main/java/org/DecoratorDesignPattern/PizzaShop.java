package org.DecoratorDesignPattern;

import org.DecoratorDesignPattern.Base.BasePizza;
import org.DecoratorDesignPattern.Base.FarmhousePizza;
import org.DecoratorDesignPattern.toppings.ExtraCheese;
import org.DecoratorDesignPattern.toppings.Mushroom;

public class PizzaShop {
    public static void main(String[] args) {
        BasePizza farmhousePizza = new FarmhousePizza();
        System.out.println("Cost of Farmhouse Pizza: " + farmhousePizza.cost());

        /*IS-A relationship*/
        BasePizza pizza = new ExtraCheese(farmhousePizza);
        System.out.println("Cost of Farmhouse Pizza with extra cheese: " + pizza.cost());

       BasePizza newPizza = new Mushroom(pizza);
        System.out.println("Cost of Farmhouse Pizza with extra cheese and mushroom: " + newPizza.cost());


    }
}
