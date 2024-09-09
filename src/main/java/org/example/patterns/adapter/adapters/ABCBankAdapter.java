/**
 * This is a class that is prepared by the users of the third party services
 * and is specific to the ABC Bank
 */

package org.example.patterns.adapter.adapters;

import org.example.extrasoutofpatternscope.adapter.thirdpartyapipackage.ABCThirdPartyBankAPI;

public class ABCBankAdapter implements IBankAPI {

    ABCThirdPartyBankAPI abcThirdPartyBankAPI = new ABCThirdPartyBankAPI();

    @Override
    public void checkBalance() {

        System.out.println(abcThirdPartyBankAPI.interpretBalance());
        System.out.println(abcThirdPartyBankAPI.retriveBalance());
        System.out.println(abcThirdPartyBankAPI.returnBalance());
    }

    @Override
    public void sendMoney(String src, String dest, Double amount) {
        abcThirdPartyBankAPI.setSourceAccount(src);
        abcThirdPartyBankAPI.setDestinationAccount(dest);
        System.out.println(abcThirdPartyBankAPI.checkAmount(amount));
    }

    @Override
    public void register() {
        abcThirdPartyBankAPI.registerAccount();
    }
}
