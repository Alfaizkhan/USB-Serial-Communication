package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal blinking text visual effect controller.
 */
public final class TextBlinkStyle {
    private final String identifier;
    private final long timestamp;

    public TextBlinkStyle() {
        this("TextBlinkStyle");
    }

    public TextBlinkStyle(String identifier) {
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
        return "TextBlinkStyle[" + identifier + "]";
    }
}
