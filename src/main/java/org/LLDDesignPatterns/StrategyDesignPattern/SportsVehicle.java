package org.LLDDesignPatterns.StrategyDesignPattern;

import org.LLDDesignPatterns.StrategyDesignPattern.Strategy.DriveStrategy;
import org.LLDDesignPatterns.StrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
