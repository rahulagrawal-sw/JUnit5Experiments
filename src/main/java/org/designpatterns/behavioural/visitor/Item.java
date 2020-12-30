package org.designpatterns.behavioural.visitor;

public interface Item {
    public int accept(PriceVisitor visitor);
}
