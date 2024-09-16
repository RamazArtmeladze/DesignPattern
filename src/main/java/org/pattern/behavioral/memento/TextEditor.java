package org.pattern.behavioral.memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Create a memento representing the current state
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Restore the state from a memento
    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }
}
