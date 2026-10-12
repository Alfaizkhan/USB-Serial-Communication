package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal italic typeface style helper.
 */
public final class TextItalicStyle {
    private final String identifier;
    private final long timestamp;

    public TextItalicStyle() {
        this("TextItalicStyle");
    }

    public TextItalicStyle(String identifier) {
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
        return "TextItalicStyle[" + identifier + "]";
    }
}
