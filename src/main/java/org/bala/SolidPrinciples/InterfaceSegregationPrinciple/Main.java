package org.bala.SolidPrinciples.InterfaceSegregationPrinciple;

import org.bala.SolidPrinciples.InterfaceSegregationPrinciple.GoodCode.MultiPurposeMachine;
import org.bala.SolidPrinciples.InterfaceSegregationPrinciple.GoodCode.SimpleMachine;

public class Main {
    public static void main(String[] args) {
        MultiPurposeMachine machine = new MultiPurposeMachine();
        machine.copy();
        machine.print();
        machine.scan();

        SimpleMachine simpleMachine = new SimpleMachine();
        simpleMachine.print();
    }
}
