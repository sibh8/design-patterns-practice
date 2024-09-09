/**
 * This is a class that is prepared by 3rd party Banking Service
 * and not the entity implementing adapter pattern
 */

package org.example.extrasoutofpatternscope.adapter.thirdpartyapipackage;

public class ABCThirdPartyBankAPI {

    public String interpretBalance(){
        return "ABC Bank: Interpreting Balance";
    }

    public String retriveBalance(){
        return "ABC Bank: Retriving Balance";
    }

    public String returnBalance(){
        return "ABC Bank: Balance calculated";
    }

    public void setSourceAccount(String src){
        System.out.println("\n\nABC Bank: Source account: "+src);
    }

    public void setDestinationAccount(String dest){
        System.out.println("ABC Bank: Destination account: "+dest);
    }

    public String checkAmount(Double amount){
        if(amount > 10000){
            throw new IllegalArgumentException("ABC Bank: Illegal amount: Needs to be less than 1000. Actual: "+amount);
        }
        return "ABC Bank: Amount received: "+amount;
    }

    public void registerAccount(){
        System.out.println("\n\nABC Bank: Account registered");
    }
}
