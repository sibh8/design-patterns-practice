package org.example.extrasoutofpatternscope.factory.components.button;

public class WindowsButtom implements Button{
    @Override
    public void click() {
        System.out.println("Windows Button Click");
    }

    @Override
    public void changeSize() {
        System.out.println("Windows Button Change Size");

    }
}
