package org.LLDDesignPatterns.DecoratorDesignpattern;

import org.LLDDesignPatterns.DecoratorDesignpattern.Pizza.BasePizza;
import org.LLDDesignPatterns.DecoratorDesignpattern.Pizza.Margherita;
import org.LLDDesignPatterns.DecoratorDesignpattern.Toppings.ExtraCheese;
import org.LLDDesignPatterns.DecoratorDesignpattern.Toppings.ExtraMushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza= new ExtraCheese(new ExtraMushroom(new Margherita()));

        System.out.println(pizza.cost());
    }
}
