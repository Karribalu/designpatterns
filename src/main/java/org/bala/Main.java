package org.bala;


import org.bala.SolidPrinciples.OpenClosed.OpenClosed;

public class Main {
    public static void main(String[] args) {
//        org.bala.SolidPrinciples.SingleResponsibility.Executor executor = new org.bala.SolidPrinciples.SingleResponsibility.Executor();
//        executor.run();
        OpenClosed openClosed = new OpenClosed();
        openClosed.run();
    }
}