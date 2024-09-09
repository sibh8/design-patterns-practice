package org.example.patterns.observer;

public class InventorySubscriber implements IAfterOrderSubscriber{

    public InventorySubscriber(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOrder(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Event generated after order is placed");
    }
}
