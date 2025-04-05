package org.bala.SolidPrinciples.LiskovSubstitutionPrinciple;

public class WriteableFile extends ReadableFile implements Writable {
    public void write() {
        System.out.println("Writing to a file");
    }
}
