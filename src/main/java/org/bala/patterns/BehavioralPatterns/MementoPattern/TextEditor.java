package org.bala.patterns.BehavioralPatterns.MementoPattern;

public class TextEditor {
    public String content = "";

    public void type(String c) {
        this.content += c;
    }

    public EditorMemento save() {
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }

    public String toString() {
        return this.content;
    }
}
