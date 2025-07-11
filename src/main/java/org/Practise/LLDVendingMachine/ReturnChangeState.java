package org.Practise.LLDVendingMachine;

public class ReturnChangeState implements VendingMachineState{
    VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Please collect the change first.");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Please collect the change first.");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Please collect the change first.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product already dispensed. Please collect the change.");
    }
    @Override
    public void returnChange() {
        double change = vendingMachine.getPayment() - vendingMachine.getSelectedProduct().getPrice();
        if (change > 0) {
            System.out.println("Change returned: $" + change);
        } else {
            System.out.println("No change to return.");
        }

        vendingMachine.resetPayment();
        vendingMachine.resetSelectedProduct();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }
}
