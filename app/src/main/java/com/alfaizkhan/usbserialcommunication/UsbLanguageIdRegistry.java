package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB Language Identifier (LANGID) code constants.
 */
public final class UsbLanguageIdRegistry {
    private final String identifier;
    private final long timestamp;

    public UsbLanguageIdRegistry() {
        this("UsbLanguageIdRegistry");
    }

    public UsbLanguageIdRegistry(String identifier) {
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
        return "UsbLanguageIdRegistry[" + identifier + "]";
    }
}
