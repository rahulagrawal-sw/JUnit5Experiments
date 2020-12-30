package org.junit5experiments;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {

    List<Trade> tradeList;

    private TradeServiceImpl() {
        Trade t11 = new Trade("T1", "V1", 1000d);
        Trade t12 = new Trade("T1", "V2", 1100d);
        Trade t2 = new Trade("T2", "V1", 2000d);
        tradeList = Arrays.asList(t11, t12, t2);
    }

    @Override
    public List<Trade> listTrades() {
        return tradeList;
    }

    @Override
    public Trade findTradeByTradeId(String tradeId) {
        return tradeList.stream()
                 .filter(trade -> trade.getTradeId().equals(tradeId))
                 .findFirst()
                 .orElseThrow();
    }

}
