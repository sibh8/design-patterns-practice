package org.example.patterns.factory.factories;

import org.example.patterns.factory.UIFactory;
import org.example.extrasoutofpatternscope.factory.components.button.WindowsButtom;
import org.example.extrasoutofpatternscope.factory.components.button.Button;
import org.example.extrasoutofpatternscope.factory.components.dropdown.DropDown;
import org.example.extrasoutofpatternscope.factory.components.dropdown.WindowsDropDown;
import org.example.extrasoutofpatternscope.factory.components.menu.WindowsMenu;
import org.example.extrasoutofpatternscope.factory.components.menu.Menu;

public class WindowsUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButtom();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
