package org.bala.patterns.BehavioralPatterns.MementoPattern;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();
        editor.type("Hello ");
        history.save(editor);
        editor.type("Bala");
        history.save(editor);
        System.out.println(editor); // Hello Bala
        history.undo(editor);
        System.out.println(editor); // Hello
        history.redo(editor);
        history.save(editor);
        System.out.println(editor); // Hello Bala
        history.undo(editor);
        System.out.println(editor);
        history.redo(editor);
        history.save(editor);
        System.out.println(editor);
    }
}
