package org.designpatterns.behavioural.visitor;

public class Monitor implements Item {

    private String monitorBrand;
    private int monitorPrice;

    public Monitor(String monitorBrand, int monitorPrice) {
        this.monitorBrand = monitorBrand;
        this.monitorPrice = monitorPrice;
    }

    @Override
    public int accept(PriceVisitor visitor) {
        return visitor.visit(this);
    }

    public String getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorBrand(String monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public int getMonitorPrice() {
        return monitorPrice;
    }

    public void setMonitorPrice(int monitorPrice) {
        this.monitorPrice = monitorPrice;
    }
}
