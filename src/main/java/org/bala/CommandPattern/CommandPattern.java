package org.bala.CommandPattern;

public class CommandPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        BoldCommand command = new BoldCommand(editor);
        ItalicCommand italicCommand = new ItalicCommand(editor);
        Button button = new Button(command);
        Button italicButton = new Button(italicCommand);
        button.click();
        italicButton.click();
    }
}
