package com.alfaizkhan.usbserialcommunication;

public enum TimestampPrecision {
    NONE("None"),
    SECONDS("Seconds (HH:mm:ss)"),
    MILLISECONDS("Milliseconds (HH:mm:ss.SSS)");

    private final String label;

    TimestampPrecision(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
