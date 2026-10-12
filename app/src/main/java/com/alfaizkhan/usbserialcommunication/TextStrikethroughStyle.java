package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal text strikethrough styling span helper.
 */
public final class TextStrikethroughStyle {
    private final String identifier;
    private final long timestamp;

    public TextStrikethroughStyle() {
        this("TextStrikethroughStyle");
    }

    public TextStrikethroughStyle(String identifier) {
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
        return "TextStrikethroughStyle[" + identifier + "]";
    }
}
