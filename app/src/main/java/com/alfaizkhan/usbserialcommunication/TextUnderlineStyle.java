package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal text single and double underline style helper.
 */
public final class TextUnderlineStyle {
    private final String identifier;
    private final long timestamp;

    public TextUnderlineStyle() {
        this("TextUnderlineStyle");
    }

    public TextUnderlineStyle(String identifier) {
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
        return "TextUnderlineStyle[" + identifier + "]";
    }
}
