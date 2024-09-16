package org.pattern.behavioral.visitor;

public class Groceries implements Item {
    private String name;
    private double price;

    public Groceries(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Groceries "accepts" the visitor
    }
}
