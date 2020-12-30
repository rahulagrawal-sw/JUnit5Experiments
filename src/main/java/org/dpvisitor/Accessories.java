package org.dpvisitor;

public class Accessories  implements KItem {
    private String name;
    private int price;

    @Override
    public int accept(KVisitor kVisitor) {
        return kVisitor.visit(this);
    }

    public Accessories(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
