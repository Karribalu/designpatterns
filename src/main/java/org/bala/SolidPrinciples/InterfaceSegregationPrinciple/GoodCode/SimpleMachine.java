package org.bala.SolidPrinciples.InterfaceSegregationPrinciple.GoodCode;

public class SimpleMachine implements Printer{
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
