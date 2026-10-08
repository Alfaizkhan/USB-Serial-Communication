package com.alfaizkhan.usbserialcommunication;

public enum BreakSignalDuration {
    SHORT_100MS(100, "100 ms"),
    MEDIUM_250MS(250, "250 ms"),
    LONG_500MS(500, "500 ms"),
    EXTENDED_1000MS(1000, "1000 ms");

    private final int millis;
    private final String label;

    BreakSignalDuration(int millis, String label) {
        this.millis = millis;
        this.label = label;
    }

    public int getMillis() { return millis; }
    public String getLabel() { return label; }
}
