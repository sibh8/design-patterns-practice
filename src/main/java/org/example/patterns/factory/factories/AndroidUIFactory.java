package org.example.patterns.factory.factories;

import org.example.patterns.factory.UIFactory;
import org.example.extrasoutofpatternscope.factory.components.button.AndroidButtom;
import org.example.extrasoutofpatternscope.factory.components.button.Button;
import org.example.extrasoutofpatternscope.factory.components.dropdown.AndroidDropDown;
import org.example.extrasoutofpatternscope.factory.components.dropdown.DropDown;
import org.example.extrasoutofpatternscope.factory.components.menu.AndroidMenu;
import org.example.extrasoutofpatternscope.factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButtom();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
