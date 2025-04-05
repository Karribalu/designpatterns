package org.bala.SolidPrinciples.InterfaceSegregationPrinciple.GoodCode;

public class MultiPurposeMachine implements Printer, Scanner, Copier {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void copy() {
        System.out.println("Copying...");
    }
}
