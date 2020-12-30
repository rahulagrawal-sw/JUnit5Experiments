package org.java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemoUsingOrders {
    public static void main(String args[]) {
        // Initialization of Collection
        List<Order> orderBook = buildOrderList();

        orderCountByType(orderBook);

        symbolWiseAvgPrice(orderBook);

    }

    private static void symbolWiseAvgPrice(List<Order> orderBook) {
        Map<String, Double> symbolWiseAvgPrice =
        orderBook.stream()
                 .collect(Collectors.groupingBy(Order::symbol, Collectors.averagingDouble(Order::price)));

        for(Map.Entry entry : symbolWiseAvgPrice.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void orderCountByType(List<Order> orderBook) {
        Map<Order.Side, Long> orderTypeCounts =
                orderBook.stream()
                 .collect(Collectors.groupingBy(Order::side, Collectors.counting()));

        for(Map.Entry entry : orderTypeCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static List<Order> buildOrderList() {
        List<Order> orderBook = new ArrayList<>();
        Order buyGoogle = new Order("GOOG.NS", 300, 900, Order.Side.BUY);
        Order sellGoogle = new Order("GOOG.NS", 600, 800, Order.Side.SELL);
        Order buyApple = new Order("APPL.NS", 400, 500, Order.Side.BUY);
        Order sellApple = new Order("APPL.NS", 200, 40, Order.Side.SELL);
        Order buyGS = new Order("GS.NS", 300, 10, Order.Side.BUY);
        orderBook.add(buyGoogle);
        orderBook.add(sellGoogle);
        orderBook.add(buyApple);
        orderBook.add(sellApple);
        orderBook.add(buyGS);
        return orderBook;
    }
}
