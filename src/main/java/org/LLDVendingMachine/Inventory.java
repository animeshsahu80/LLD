package org.LLDVendingMachine;

import java.util.List;

public class Inventory {
    ItemShelf[] itemShelves=null;

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }

    Inventory(int count){
        itemShelves= new ItemShelf[count];
        initializeEmptyInventory();
    }
    public void initializeEmptyInventory(){
        int startCode=101;
        for(int i=0;i<itemShelves.length;i++){
            ItemShelf space= new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            itemShelves[i]=space;
            startCode++;
        }
    }

    public  void addItem(Item item,int code) throws Exception {
        for(ItemShelf shelf:itemShelves){
            if(shelf.getCode()==code){
                if(shelf.isSoldOut()){
                    shelf.setItem(item);
                    shelf.setSoldOut(false);
                }
                else {
                    throw new Exception("item already present");
                }
            }
        }
    }
    public Item getItem(int codeNumber) throws Exception {

        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber){
        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.code == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }





}
