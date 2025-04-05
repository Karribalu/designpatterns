package org.bala.SolidPrinciples.LiskovSubstitutionPrinciple;

public class ReadableFile implements Readable{

    @Override
    public void read() {
        System.out.println("Reading the file");
    }
}
