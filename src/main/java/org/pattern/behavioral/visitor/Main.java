package org.pattern.behavioral.visitor;

/*
Without the Visitor pattern, tax calculation logic would be scattered across
the Book, Electronics, and Groceries classes, violating the Single Responsibility Principle.
Adding a new operation like a discount calculation would require modifying all item classes.
 */

public class Main {
    public static void main(String[] args) {
        // Create items
        Item book = new Book("Design Patterns", 50.0);
        Item electronics = new Electronics("Laptop", 1000.0);
        Item groceries = new Groceries("Milk", 2.0);

        // Create a visitor
        Visitor taxVisitor = new TaxVisitor();

        // Apply the visitor to each item
        System.out.println("Calculating taxes:");
        book.accept(taxVisitor);
        electronics.accept(taxVisitor);
        groceries.accept(taxVisitor);
    }
}