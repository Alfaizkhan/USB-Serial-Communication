package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ASCII 0x0C Form Feed page break handler.
 */
public final class FormFeedCharacterHandler {
    private final String identifier;
    private final long timestamp;

    public FormFeedCharacterHandler() {
        this("FormFeedCharacterHandler");
    }

    public FormFeedCharacterHandler(String identifier) {
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
        return "FormFeedCharacterHandler[" + identifier + "]";
    }
}
