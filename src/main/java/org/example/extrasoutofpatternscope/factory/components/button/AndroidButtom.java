package org.example.extrasoutofpatternscope.factory.components.button;

public class AndroidButtom implements Button{
    @Override
    public void click() {
        System.out.println("Android Button Click");
    }

    @Override
    public void changeSize() {
        System.out.println("Android Button Change Size");

    }
}
