/**
 * This is a class that is prepared by 3rd party Banking Service
 * and not the entity implementing adapter pattern
 */

package org.example.extrasoutofpatternscope.adapter.thirdpartyapipackage;

public class XYZThirdPartyBankAPI {
    
    public String findBalance(){
        return "XYZ Bank: Finding Balance from";
    }
    
    public String getBalance(){
        return "XYZ Bank: Getting Balance";
    }
    
    public String sendBalance(){
        return "XYZ Bank: Balance sent";
    }
    
    public void setSourceAccount(String src){
        System.out.println("\n\nXYZ Bank: Source account: "+src);
    }
    
    public void setDestinationAccount(String dest){
        System.out.println("XYZ Bank: Destination account: "+dest);
    }
    
    public String checkAmount(Double amount){
        if(amount > 10000){
            throw new IllegalArgumentException("XYZ Bank: Illegal amount: Needs to be less than 1000. Actual: "+amount);
        }
        return "XYZ Bank: Amount received: "+amount;
    }
    
    public void registerAccount(){
        System.out.println("\n\nXYZ Bank: Account registered"); 
    }
}
