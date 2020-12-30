package org.dpvisitor;

public class KVisitorImpl implements KVisitor {

    @Override
    public int visit(Mobile mobile) {
        return mobile.getPrice() - 100;
    }

    @Override
    public int visit(Accessories accessories) {
        return accessories.getPrice() - 10;
    }
}
