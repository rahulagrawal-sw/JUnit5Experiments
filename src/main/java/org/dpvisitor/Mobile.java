package org.dpvisitor;

public class Mobile implements KItem {
    private String brand;
    private int price;


    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int accept(KVisitor kVisitor) {
        return kVisitor.visit(this);
    }
}
