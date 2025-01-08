package org.LLDATMMachine;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;



    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getHolderName() {
        return holderName;
    }

    public void setHolderName(int holderName) {
        this.holderName = holderName;
    }

    public UserBankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public int getBankBalance(){
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount){
        bankAccount.withdrawalBalance(amount);
    }




    private int holderName;
    static int PIN_NUMBER = 112211;
    private UserBankAccount bankAccount;

    public boolean isCorrectPINEntered(int pin) {

        if (pin == PIN_NUMBER) {
            return true;
        }
        return false;
    }

}
