package org.example.patterns.observer;

public class InvoiceGeneratorSubscriber implements IAfterOrderSubscriber{

    public InvoiceGeneratorSubscriber(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOrder(this);
    }

    @Override
    public void announceOrderPlaced() {

        System.out.println("Create Invoice event generated after order is placed");
    }
}
