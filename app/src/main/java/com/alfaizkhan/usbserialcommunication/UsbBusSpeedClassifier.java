package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB Low (1.5M), Full (12M), and High (480M) speed classifier.
 */
public final class UsbBusSpeedClassifier {
    private final String identifier;
    private final long timestamp;

    public UsbBusSpeedClassifier() {
        this("UsbBusSpeedClassifier");
    }

    public UsbBusSpeedClassifier(String identifier) {
        this.identifier = Objects.requireNonNull(identifier, "identifier cannot be null");
        this.timestamp = System.currentTimeMillis();
    }

    public String getIdentifier() {
        return identifier;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean isValid() {
        return identifier != null && !identifier.isEmpty();
    }

    @Override
    public String toString() {
        return "UsbBusSpeedClassifier[" + identifier + "]";
    }
}
