package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * SLIP RFC 1055 control character constants and escape rules.
 */
public final class SlipSpecialCharacters {
    private final String identifier;
    private final long timestamp;

    public SlipSpecialCharacters() {
        this("SlipSpecialCharacters");
    }

    public SlipSpecialCharacters(String identifier) {
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
        return "SlipSpecialCharacters[" + identifier + "]";
    }
}
