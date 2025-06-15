package org.Practise.LLDVendingMachine;

public class DispenseState implements VendingMachineState{
    VendingMachine vendingMachine;
    public DispenseState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product already selected. Please collect the dispensed product.");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Payment already made. Please collect the dispensed product.");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Payment already made. Please collect the dispensed product.");
    }
    @Override
    public void dispenseProduct(){
        Product product= vendingMachine.getSelectedProduct();
        vendingMachine.getInventory().updateQuantity(product,vendingMachine.getInventory().getQuantityForProduct(product)-1);
        System.out.println("Product dispensed "+ product.getName());
        vendingMachine.setCurrentState(vendingMachine.getReturnChangeState());
    };
    @Override
    public void returnChange(){
        System.out.println("Please collect the product first");

    };
}
