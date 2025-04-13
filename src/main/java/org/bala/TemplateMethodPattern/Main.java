package org.bala.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        DataParser jsonParser = new JSONParser();
        csvParser.parse("data.csv");
        jsonParser.parse("data.json");
    }
}
