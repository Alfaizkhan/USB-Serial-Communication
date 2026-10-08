package com.alfaizkhan.usbserialcommunication;

public enum UsbSpeed {
    LOW_SPEED("Low Speed (1.5 Mbps)"),
    FULL_SPEED("Full Speed (12 Mbps)"),
    HIGH_SPEED("High Speed (480 Mbps)"),
    UNKNOWN("Unknown");

    private final String description;

    UsbSpeed(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
