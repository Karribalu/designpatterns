package org.bala.patterns.BehavioralPatterns.MementoPattern;

import java.util.Stack;

public class EditorHistory {
    public Stack<EditorMemento> history = new Stack<>();
    public Stack<EditorMemento> forwardHistory = new Stack<>();

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            forwardHistory.push(history.pop());
            if (!history.isEmpty()) {
                editor.restore(history.peek());
            }
        }
    }

    public void redo(TextEditor editor) {
        if (!forwardHistory.isEmpty()) {
            editor.restore(forwardHistory.pop());
        }
    }

    public void save(TextEditor editor) {
        history.push(editor.save());
    }
}
