package org.bala.CommandPattern;

public class ItalicCommand implements ICommand {
    TextEditor editor;

    ItalicCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.editor.italic();
    }
}
