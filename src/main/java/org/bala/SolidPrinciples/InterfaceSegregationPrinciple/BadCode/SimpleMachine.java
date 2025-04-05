package org.bala.SolidPrinciples.InterfaceSegregationPrinciple.BadCode;

/**
 * This is not a good pattern as we are mandated to implement unwanted methods
 */
public class SimpleMachine implements Machine {
    @Override
    public void print() {
        System.out.println("Printing..");
    }

    @Override
    public void copy() {
        throw new UnsupportedOperationException("Copying not supported");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scanning not supported");

    }
}
