package org.LLDDesignPatterns.StrategyDesignPattern;

import org.LLDDesignPatterns.StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
