package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Registry storing hardware features supported by attached device.
 */
public final class DeviceCapabilitiesRegistry {
    private final String identifier;
    private final long timestamp;

    public DeviceCapabilitiesRegistry() {
        this("DeviceCapabilitiesRegistry");
    }

    public DeviceCapabilitiesRegistry(String identifier) {
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
        return "DeviceCapabilitiesRegistry[" + identifier + "]";
    }
}
