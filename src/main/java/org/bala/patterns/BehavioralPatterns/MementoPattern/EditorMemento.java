package org.bala.patterns.BehavioralPatterns.MementoPattern;

public class EditorMemento {
    public String content = "";

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
