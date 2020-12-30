package org.designpatterns.behavioural.mypractice;

public class VisitorMainDemo {

    public static void main(String[] args) {
        MyItem [] items = new MyItem[] {
          new Furniture("ABC", 1000),
          new Decor("PQR", 1000)
        };

        MyItemPriceVisitor myItemPriceVisitor = new MyItemPriceVisitorImpl();
        int totalPrice = 0;

        for(MyItem item: items) {
            totalPrice += item.accept(myItemPriceVisitor);
        }

        System.out.println(totalPrice);
    }
}
