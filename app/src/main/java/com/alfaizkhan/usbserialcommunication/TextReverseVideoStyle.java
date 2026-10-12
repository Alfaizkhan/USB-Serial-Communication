package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Inverted foreground and background video style helper.
 */
public final class TextReverseVideoStyle {
    private final String identifier;
    private final long timestamp;

    public TextReverseVideoStyle() {
        this("TextReverseVideoStyle");
    }

    public TextReverseVideoStyle(String identifier) {
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
        return "TextReverseVideoStyle[" + identifier + "]";
    }
}
