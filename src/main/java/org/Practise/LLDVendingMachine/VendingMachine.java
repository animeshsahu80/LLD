package org.Practise.LLDVendingMachine;

import org.LLDBookMyShow.Payment;

public class VendingMachine {
    private final VendingMachineState idleState;
    private final VendingMachineState readyState;
    private final VendingMachineState dispenseState;
    private final VendingMachineState returnChangeState;

    private VendingMachineState currentState;
    private Inventory inventory;
    private static VendingMachine instance;

    private Product selectedProduct;

    double payment;

    public VendingMachine() {
        this.idleState= new IdleState(this);
        this.returnChangeState= new ReturnChangeState(this);
        this.dispenseState= new DispenseState(this);
        this.readyState= new ReadyState(this);
        this.currentState= idleState;
        this.inventory= new Inventory();
        this.selectedProduct=null;
        this.payment= 0.0;
    }

    public static synchronized VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachine();
        }
        return instance;
    }
    public void addCoin(Coin coin){
        payment+= coin.getValue();

    }
    public Product addProduct(String name, double price, int quantity,int code) {
        Product product = new Product(name, price,code);
        inventory.addProduct(product, quantity);
        return product;
    }

    public void selectProduct(Product product) {

        currentState.selectProduct(product);
    }

    public void insertCoin(Coin coin) {
        currentState.insertCoin(coin);
    }

    public void insertNote(Note note) {
        currentState.insertNote(note);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    public void returnChange() {
        currentState.returnChange();
    }

    public void addNote(Note note){
        payment+= note.getValue();
    }
    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getReadyState() {
        return readyState;
    }

    public VendingMachineState getDispenseState() {
        return dispenseState;
    }

    public VendingMachineState getReturnChangeState() {
        return returnChangeState;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
    void resetSelectedProduct() {
        selectedProduct = null;
    }
    void resetPayment() {
        payment = 0.0;
    }

}
