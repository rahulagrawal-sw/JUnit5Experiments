package org.designpatterns.behavioural.mypractice;

public class MyItemPriceVisitorImpl implements MyItemPriceVisitor {

    @Override
    public int visit(Furniture furniture) {
        return furniture.getPrice() - 100;
    }

    @Override
    public int visit(Decor decor) {
        return decor.getPrice() - 100;
    }
}
