/**
 * This is a class that is prepared by the users of the third party services
 * and is specific to the XYZ Bank
 */

package org.example.patterns.adapter.adapters;

import org.example.extrasoutofpatternscope.adapter.thirdpartyapipackage.XYZThirdPartyBankAPI;

public class XYABankAdapter implements IBankAPI {

    XYZThirdPartyBankAPI XYZThirdPartyBankAPI = new XYZThirdPartyBankAPI();
    
    @Override
    public void checkBalance() {
        
        System.out.println(XYZThirdPartyBankAPI.findBalance());
        System.out.println(XYZThirdPartyBankAPI.getBalance());
        System.out.println(XYZThirdPartyBankAPI.sendBalance());
    }

    @Override
    public void sendMoney(String src, String dest, Double amount) {
        XYZThirdPartyBankAPI.setSourceAccount(src);
        XYZThirdPartyBankAPI.setDestinationAccount(dest);
        System.out.println(XYZThirdPartyBankAPI.checkAmount(amount));
    }

    @Override
    public void register() {
        XYZThirdPartyBankAPI.registerAccount();
    }
}
