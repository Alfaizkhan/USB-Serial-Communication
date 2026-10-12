package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Backslash-escaped control character tokenizer.
 */
public final class EscapedFrameTokenizer {
    private final String identifier;
    private final long timestamp;

    public EscapedFrameTokenizer() {
        this("EscapedFrameTokenizer");
    }

    public EscapedFrameTokenizer(String identifier) {
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
        return "EscapedFrameTokenizer[" + identifier + "]";
    }
}
