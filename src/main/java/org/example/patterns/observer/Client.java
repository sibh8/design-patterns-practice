package org.example.patterns.observer;

public class Client {

    public static void main(String[] args) {
        EmailSubscriber emailSubscriber = new EmailSubscriber();
        InventorySubscriber inventorySubscriber = new InventorySubscriber();
        InvoiceGeneratorSubscriber invoiceGeneratorSubscriber = new InvoiceGeneratorSubscriber();

        Flipkart.onOrderPlaced();
    }
}
