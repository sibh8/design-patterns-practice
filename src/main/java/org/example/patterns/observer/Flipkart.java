package org.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private static List<IAfterOrderSubscriber> iAfterOrderSubscribers = new ArrayList<>();
    private static Flipkart flipkartSubscriber = null;

    private Flipkart(){}

    public static Flipkart getInstance(){
        if(flipkartSubscriber == null){
            synchronized (Flipkart.class){
                if(flipkartSubscriber == null)
                    return new Flipkart();
            }
        }
        return flipkartSubscriber;
    }

    public void registerOrder(IAfterOrderSubscriber iAfterOrderSubscriber){
        iAfterOrderSubscribers.add(iAfterOrderSubscriber);
    }

    public void removeSubscriber(IAfterOrderSubscriber iAfterOrderSubscriber){
        iAfterOrderSubscribers.remove(iAfterOrderSubscriber);
    }

    public static void onOrderPlaced(){
        for(IAfterOrderSubscriber iAfterOrderSubscriber: iAfterOrderSubscribers){
            iAfterOrderSubscriber.announceOrderPlaced();
        }
    }
}
