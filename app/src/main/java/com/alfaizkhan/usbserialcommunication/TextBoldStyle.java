package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal bold/bright typeface weight style helper.
 */
public final class TextBoldStyle {
    private final String identifier;
    private final long timestamp;

    public TextBoldStyle() {
        this("TextBoldStyle");
    }

    public TextBoldStyle(String identifier) {
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
        return "TextBoldStyle[" + identifier + "]";
    }
}
