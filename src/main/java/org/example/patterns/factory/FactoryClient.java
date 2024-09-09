package org.example.patterns.factory;

import org.example.extrasoutofpatternscope.factory.components.button.Button;
import org.example.extrasoutofpatternscope.factory.components.dropdown.DropDown;
import org.example.extrasoutofpatternscope.factory.components.menu.Menu;
import org.example.patterns.factory.helper.UIFactoryHelper;

public class FactoryClient {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = UIFactoryHelper.getUIFactory(SupportedPlatform.MAC);

        Button button = uiFactory.createButton();
        button.click();
        button.changeSize();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.elementCount();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
