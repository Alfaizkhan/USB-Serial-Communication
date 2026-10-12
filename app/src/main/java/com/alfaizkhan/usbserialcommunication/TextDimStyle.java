package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal dim/faint intensity text style helper.
 */
public final class TextDimStyle {
    private final String identifier;
    private final long timestamp;

    public TextDimStyle() {
        this("TextDimStyle");
    }

    public TextDimStyle(String identifier) {
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
        return "TextDimStyle[" + identifier + "]";
    }
}
