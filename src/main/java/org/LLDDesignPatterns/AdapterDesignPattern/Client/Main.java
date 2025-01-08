package org.LLDDesignPatterns.AdapterDesignPattern.Client;

import org.LLDDesignPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import org.LLDDesignPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import org.LLDDesignPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}

