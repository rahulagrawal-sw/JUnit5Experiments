package org.junit5experiments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.NoSuchElementException;

@SpringBootTest
public class TradeServiceTest {
    @Autowired
    TradeService tradeService;

    @Test
    @DisplayName("Given Trades Request then return all trades")
    public void listTrades() {
        List<Trade> tradeList = tradeService.listTrades();
        Assertions.assertEquals(3, tradeList.size());
    }

    @Test
    @DisplayName("Given valid TradeId then return trade details")
    public void findByTradeId_Found() {
        String tradeId = "T1";
        Trade trade = tradeService.findTradeByTradeId(tradeId);
        Assertions.assertEquals(tradeId, trade.getTradeId());
    }

    @DisplayName("Given valid TradeId then return not found")
    public void findByTradeId_NotFound() {
        String tradeId = "TRADENOTFOUND";
        Assertions.assertThrows(NoSuchElementException.class, (Executable) tradeService.findTradeByTradeId(tradeId));
    }
}
