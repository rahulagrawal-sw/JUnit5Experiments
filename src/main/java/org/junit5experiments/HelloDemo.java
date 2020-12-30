package org.junit5experiments;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HelloDemo {
    public static void main(String[] args) {

        Trade t11 = new Trade("T1", "V1", 1000d);
        Trade t12 = new Trade("T1", "V2", 1100d);
        Trade t2 = new Trade("T2", "V1", 2000d);
        List<Trade> tradeList = Arrays.asList(t11, t12, t2);


        Map<String, DoubleSummaryStatistics> tradeAmounts = tradeList.stream()
                                                              .collect(Collectors.groupingBy(Trade::getTradeId,
                                                   Collectors.summarizingDouble(Trade::getNotional1)));

        tradeAmounts.forEach((k, v) ->
                System.out.println(String.format("Trade Id %s Amount is %f", k, v.getSum())));
    }
}
