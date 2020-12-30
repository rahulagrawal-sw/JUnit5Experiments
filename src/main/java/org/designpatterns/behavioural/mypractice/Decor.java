package org.designpatterns.behavioural.mypractice;

public class Decor implements MyItem {

    private String name;
    private int price;

    public Decor(String name, int price) {
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

    @Override
    public int accept(MyItemPriceVisitor myItemPriceVisitor) {
        return myItemPriceVisitor.visit(this);
    }
}
