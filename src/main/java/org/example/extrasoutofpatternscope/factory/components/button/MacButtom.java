package org.example.extrasoutofpatternscope.factory.components.button;

public class MacButtom implements Button{
    @Override
    public void click() {
        System.out.println("Mac Button Click");
    }

    @Override
    public void changeSize() {
        System.out.println("Mac Button Change Size");

    }
}
