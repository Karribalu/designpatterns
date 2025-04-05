package org.bala.SolidPrinciples.LiskovSubstitutionPrinciple;

/**
 * The Liskov Substitution Principle states that objects of a superclass should be replaceable with objects of a subclass without altering the correctness
 * of the program
 * Example of a file system
 * File may be an interface which has Write and Read functions
 * ReadOnlyFile implements the File interface but should not implement the Read function as it is not supported
 * <p>
 * We fix the issue by seperating the corncerns liek ReadableFile, WritableFile and implement them seperately
 */
public class Main {
    public static void readAnyFile(ReadableFile file){
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readOnlyFile = new ReadOnlyFile();
        readOnlyFile.read();
        WriteableFile writeableFile = new WriteableFile();
        writeableFile.write();
        writeableFile.read();

        readAnyFile(readOnlyFile);
        readAnyFile(writeableFile);
    }
}
