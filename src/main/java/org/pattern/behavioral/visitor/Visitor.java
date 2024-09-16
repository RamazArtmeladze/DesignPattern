package org.pattern.behavioral.visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Electronics electronics);
    void visit(Groceries groceries);
}
