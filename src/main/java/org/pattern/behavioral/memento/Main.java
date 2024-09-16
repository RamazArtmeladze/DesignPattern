package org.pattern.behavioral.memento;

/*
Without the Memento pattern, you would have to manually track changes to the text and handle state restoration yourself,
which would clutter your code.
*/

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        // Initial state
        editor.setText("Hello, world!");
        System.out.println("Text: " + editor.getText());

        // Save the state
        history.save(editor.save());

        // Modify the text
        editor.setText("Hello, world! How are you?");
        System.out.println("Text after modification: " + editor.getText());

        // Save the new state
        history.save(editor.save());

        // Modify the text again
        editor.setText("Hello, everyone!");
        System.out.println("Text after second modification: " + editor.getText());

        // Undo the last modification
        editor.restore(history.undo());
        System.out.println("Text after undo: " + editor.getText());

        // Undo the previous modification
        editor.restore(history.undo());
        System.out.println("Text after second undo: " + editor.getText());
    }
}