package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Rate 1/2 constraint length 7 convolutional encoder.
 */
public final class ConvolutionalEncoder {
    private final String identifier;
    private final long timestamp;

    public ConvolutionalEncoder() {
        this("ConvolutionalEncoder");
    }

    public ConvolutionalEncoder(String identifier) {
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
        return "ConvolutionalEncoder[" + identifier + "]";
    }
}
