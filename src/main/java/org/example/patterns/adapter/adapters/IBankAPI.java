/**
 * This is the interface that has all the methods defined by the
 * clients of the third parties.
 */

package org.example.patterns.adapter.adapters;

public interface IBankAPI {

    void checkBalance();

    void sendMoney(String src, String dest, Double amount);

    void register();
}
