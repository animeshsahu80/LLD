package org.Practise.LLDVendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        // Add products to the inventory
        Product coke = vendingMachine.addProduct("Coke", 30, 3,100);
        Product pepsi = vendingMachine.addProduct("Pepsi", 40, 2,101);
        Product water = vendingMachine.addProduct("Water", 20, 5,102);

        // Insert coins
        vendingMachine.selectProduct(coke);
        vendingMachine.insertCoin(Coin.FIVE);
        vendingMachine.insertCoin(Coin.FIVE);
        vendingMachine.insertCoin(Coin.TEN);
        vendingMachine.insertCoin(Coin.TEN);
        vendingMachine.insertCoin(Coin.TEN);


        // Dispense product
        vendingMachine.dispenseProduct();

        // Return change
        vendingMachine.returnChange();


    }
}
