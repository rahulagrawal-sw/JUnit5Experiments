package org.junit5experiments;

import java.util.List;

public interface TradeService {
    List<Trade> listTrades();

    Trade findTradeByTradeId(String tradeId);
}
