package org.example.patterns.observer;

public class EmailSubscriber implements IAfterOrderSubscriber{

    public EmailSubscriber(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerOrder(this);
    }

    @Override
    public void announceOrderPlaced() {

        System.out.println("Sending Email event generated after order is placed");
    }
}
