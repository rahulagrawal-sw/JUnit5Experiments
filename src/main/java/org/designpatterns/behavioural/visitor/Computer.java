package org.designpatterns.behavioural.visitor;

public class Computer implements Item {

    private String serialNumber;
    private int price;

    public Computer(String serialNumber, int price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    @Override
    public int accept(PriceVisitor visitor) {
        return visitor.visit(this);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
