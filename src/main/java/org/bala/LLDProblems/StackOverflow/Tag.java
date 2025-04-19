package org.bala.LLDProblems.StackOverflow;

public class Tag {
    private int id;
    private String value;

    public Tag(String value) {
        this.id = generateId();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private int generateId() {
        return (int) (System.currentTimeMillis() % 100000);
    }
}
