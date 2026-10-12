package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Pre-configured profile for microcontroller firmware flashing.
 */
public final class BootloaderFlashProfile {
    private final String identifier;
    private final long timestamp;

    public BootloaderFlashProfile() {
        this("BootloaderFlashProfile");
    }

    public BootloaderFlashProfile(String identifier) {
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
        return "BootloaderFlashProfile[" + identifier + "]";
    }
}
