package org.designpatterns.behavioural.visitor;

/**
 * Visitor Pattern
 * Whenever we need to perform operations on similar kind of objects then
 * with help of Visitor pattern we can move such -- operational logic OUT from actual object. --
 */
public class VisitorClientMain {
    public static void main(String[] args) {
        Item items [] = new Item[] {
          new Computer("comp1", 1000), new Computer("comp2", 2000),
          new Monitor("LG", 500)
        };

        PriceVisitor priceVisitor = new PriceVisitorImpl();

        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.accept(priceVisitor);
        }
        System.out.println("Total Price is : " + totalPrice);
    }
}
