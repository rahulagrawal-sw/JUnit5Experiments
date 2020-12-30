package org.junit5experiments;

import java.util.Objects;

public class Trade {
    private String tradeId;
    private String tradeVersion;
    private double notional1;

    public Trade(String tradeId, String tradeVersion, double notional1) {
        this.tradeId = tradeId;
        this.tradeVersion = tradeVersion;
        this.notional1 = notional1;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeVersion() {
        return tradeVersion;
    }

    public void setTradeVersion(String tradeVersion) {
        this.tradeVersion = tradeVersion;
    }

    public double getNotional1() {
        return notional1;
    }

    public void setNotional1(double notional1) {
        this.notional1 = notional1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return tradeId.equals(trade.tradeId) &&
                tradeVersion.equals(trade.tradeVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tradeId, tradeVersion);
    }
}
