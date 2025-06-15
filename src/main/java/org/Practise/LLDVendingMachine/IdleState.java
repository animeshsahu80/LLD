package org.Practise.LLDVendingMachine;

public class IdleState implements VendingMachineState{

    VendingMachine vendingMachine;
    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void selectProduct(Product product){
        if(vendingMachine.getInventory().isAvailable(product)){
            vendingMachine.setSelectedProduct(product);
            System.out.println(product.getName()+ " Selected" );

            vendingMachine.setCurrentState(vendingMachine.getReadyState());
        }
        else{
            System.out.println(product.getName()+ " not avaialble : " );
        }
    };
    @Override
    public void insertCoin(Coin coin){
        System.out.println("Select a product first");
    };
    @Override
    public void insertNote(Note note){
        System.out.println("Select a product first");
    };
    @Override
    public void dispenseProduct(){
        System.out.println("Select a product first");
    };
    @Override
    public void returnChange(){
        System.out.println("Select a product first");
    };
}
