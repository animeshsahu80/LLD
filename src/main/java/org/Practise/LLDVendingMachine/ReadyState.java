package org.Practise.LLDVendingMachine;

public class ReadyState implements VendingMachineState{
    VendingMachine vendingMachine;
    public ReadyState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void selectProduct(Product product){
        System.out.println("Please make payment");

    };
    @Override
    public void insertCoin(Coin coin){
        System.out.println("Coin added : "+ coin.getValue());

        vendingMachine.addCoin(coin);
        System.out.println("Total Amount added : "+ vendingMachine.getPayment());
        checkPaymentStatus();
    };
    @Override
    public void insertNote(Note note){
        System.out.println("Node added : "+ note.getValue());

        vendingMachine.addNote(note);
        System.out.println("Total Amount added : "+ vendingMachine.getPayment());

        checkPaymentStatus();

    };
    @Override
    public void dispenseProduct(){};
    @Override
    public void returnChange(){};

    public void checkPaymentStatus(){
        if(vendingMachine.getPayment()<vendingMachine.getSelectedProduct().price){
            System.out.println("Insufficient amount");
        }
        else{
            vendingMachine.setCurrentState(vendingMachine.getDispenseState());
        }
    }
}
