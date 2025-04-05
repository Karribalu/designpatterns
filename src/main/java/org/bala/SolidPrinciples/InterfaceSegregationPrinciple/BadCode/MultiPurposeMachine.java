package org.bala.SolidPrinciples.InterfaceSegregationPrinciple.BadCode;

public class MultiPurposeMachine implements Machine {
    @Override
    public void print() {
        System.out.println("Printing..");
    }

    @Override
    public void copy() {
        System.out.println("Copying..");

    }

    @Override
    public void scan() {
        System.out.println("Scanning..");

    }
}
