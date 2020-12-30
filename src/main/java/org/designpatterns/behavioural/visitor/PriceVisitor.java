package org.designpatterns.behavioural.visitor;

public interface PriceVisitor {
    int visit(Computer computer);
    int visit(Monitor monitor);
}
