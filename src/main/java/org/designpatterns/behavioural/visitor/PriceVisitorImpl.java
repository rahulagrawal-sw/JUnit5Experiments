package org.designpatterns.behavioural.visitor;

public class PriceVisitorImpl implements PriceVisitor {

    @Override
    public int visit(Computer computer) {
        return computer.getPrice() - 100;
    }

    @Override
    public int visit(Monitor monitor) {
        return monitor.getMonitorPrice();
    }
}
