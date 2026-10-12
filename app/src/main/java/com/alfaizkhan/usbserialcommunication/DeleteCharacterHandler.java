package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ASCII 0x7F Delete character cursor handling helper.
 */
public final class DeleteCharacterHandler {
    private final String identifier;
    private final long timestamp;

    public DeleteCharacterHandler() {
        this("DeleteCharacterHandler");
    }

    public DeleteCharacterHandler(String identifier) {
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
        return "DeleteCharacterHandler[" + identifier + "]";
    }
}
