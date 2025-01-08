package org.LLDATMMachine.ATMStates;

import org.LLDATMMachine.ATM;
import org.LLDATMMachine.Card;

public class IdleState extends   ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }


}
