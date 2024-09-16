package org.pattern.behavioral.visitor;

public class TaxVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Calculating tax for Book: " + book.getTitle());
        double tax = book.getPrice() * 0.1; // 10% tax for books
        System.out.println("Tax for book: $" + tax);
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.println("Calculating tax for Electronics: " + electronics.getName());
        double tax = electronics.getPrice() * 0.2; // 20% tax for electronics
        System.out.println("Tax for electronics: $" + tax);
    }

    @Override
    public void visit(Groceries groceries) {
        System.out.println("Calculating tax for Groceries: " + groceries.getName());
        double tax = groceries.getPrice() * 0.05; // 5% tax for groceries
        System.out.println("Tax for groceries: $" + tax);
    }
}
