package org.example.patterns.factory;

import org.example.extrasoutofpatternscope.factory.components.button.Button;
import org.example.extrasoutofpatternscope.factory.components.dropdown.DropDown;
import org.example.extrasoutofpatternscope.factory.components.menu.Menu;

public interface UIFactory {

    Button createButton();

    Menu createMenu();

    DropDown createDropDown();
}
