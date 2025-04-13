package org.bala.CommandPattern;

public class BoldCommand implements ICommand {
    TextEditor editor;

    BoldCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.editor.bold();
    }
}
