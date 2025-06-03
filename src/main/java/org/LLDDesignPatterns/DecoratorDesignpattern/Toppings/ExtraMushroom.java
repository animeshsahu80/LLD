package org.LLDDesignPatterns.DecoratorDesignpattern.Toppings;

import org.LLDDesignPatterns.DecoratorDesignpattern.Pizza.BasePizza;

public class ExtraMushroom extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }


    @Override
    public int cost(){
        return this.basePizza.cost()+40;
    }
}

