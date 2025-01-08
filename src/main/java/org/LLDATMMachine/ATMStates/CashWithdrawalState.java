package org.LLDATMMachine.ATMStates;

import org.LLDATMMachine.ATM;
import org.LLDATMMachine.AmountWithdrawal.CashWithdrawProcessor;
import org.LLDATMMachine.AmountWithdrawal.FiveHundredWithdrawProcessor;
import org.LLDATMMachine.AmountWithdrawal.OneHundredWithdrawProcessor;
import org.LLDATMMachine.AmountWithdrawal.TwoThousandWithdrawProcessor;
import org.LLDATMMachine.Card;

public class CashWithdrawalState extends  ATMState{
    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    public void cashWithdrawal(ATM atmObject, Card card, int withdrawalAmountRequest) {

        if (atmObject.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if (card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {

            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atmObject, withdrawalAmountRequest);
            exit(atmObject);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
