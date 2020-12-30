package org.designpatterns.behavioural.mypractice;

public interface MyItemPriceVisitor {

    int visit(Furniture furniture);
    int visit(Decor decor);
}
