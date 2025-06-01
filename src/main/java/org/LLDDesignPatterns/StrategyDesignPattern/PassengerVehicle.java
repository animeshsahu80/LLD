package org.LLDDesignPatterns.StrategyDesignPattern;

import org.LLDDesignPatterns.StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
