package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ASCII 0x08 Backspace destructive vs non-destructive handler.
 */
public final class BackspaceCharacterHandler {
    private final String identifier;
    private final long timestamp;

    public BackspaceCharacterHandler() {
        this("BackspaceCharacterHandler");
    }

    public BackspaceCharacterHandler(String identifier) {
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
        return "BackspaceCharacterHandler[" + identifier + "]";
    }
}
