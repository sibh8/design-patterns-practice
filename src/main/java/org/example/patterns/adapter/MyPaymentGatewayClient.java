package org.example.patterns.adapter;

import org.example.patterns.adapter.adapters.ABCBankAdapter;
import org.example.patterns.adapter.adapters.IBankAPI;

public class MyPaymentGatewayClient {

    public static void main(String[] args) {
        // Its very easy to switch the 3rd party Bank as shown in the below
        // object creation.

        IBankAPI iBankAPI = new ABCBankAdapter();
//        IBankAPI iBankAPI = new XYABankAdapter();

        iBankAPI.checkBalance();
        iBankAPI.sendMoney("EFGAcc", "PQRAcc", 1000.00);
        iBankAPI.register();
    }
}
