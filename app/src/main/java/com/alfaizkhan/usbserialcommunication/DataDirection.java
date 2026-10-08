package com.alfaizkhan.usbserialcommunication;

public enum DataDirection {
    RX("Receive", "<-"),
    TX("Transmit", "->");

    private final String label;
    private final String symbol;

    DataDirection(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }

    public String getLabel() { return label; }
    public String getSymbol() { return symbol; }
}
