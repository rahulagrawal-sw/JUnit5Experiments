package org.dpvisitor;

public class KVisitorMain {

    public static void main(String[] args) {
        KItem [] myItems = new KItem[] {
          new Mobile("A", 100),
          new Mobile("A", 200),
          new Accessories("A", 10)
        };

        int result = 0;
        KVisitor kVisitor = new KVisitorImpl();
        for (KItem item: myItems) {
            result += item.accept(kVisitor);
        }
        System.out.println("Total Price : " + result);
    }
}
