package org.example.patterns.factory.factories;

import org.example.patterns.factory.UIFactory;
import org.example.extrasoutofpatternscope.factory.components.button.Button;
import org.example.extrasoutofpatternscope.factory.components.button.MacButtom;
import org.example.extrasoutofpatternscope.factory.components.dropdown.DropDown;
import org.example.extrasoutofpatternscope.factory.components.dropdown.MacDropDown;
import org.example.extrasoutofpatternscope.factory.components.menu.MacMenu;
import org.example.extrasoutofpatternscope.factory.components.menu.Menu;

public class MacUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButtom();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
