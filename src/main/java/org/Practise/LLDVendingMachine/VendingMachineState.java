package org.Practise.LLDVendingMachine;

public interface VendingMachineState {
    public void selectProduct(Product product);
    public void insertCoin(Coin coin);
    public void insertNote(Note note);
    public void dispenseProduct();
    public void returnChange();
}
