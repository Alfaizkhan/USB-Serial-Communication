package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Classic phosphor green on black CRT terminal theme.
 */
public final class MatrixGreenThemePalette {
    private final String identifier;
    private final long timestamp;

    public MatrixGreenThemePalette() {
        this("MatrixGreenThemePalette");
    }

    public MatrixGreenThemePalette(String identifier) {
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
        return "MatrixGreenThemePalette[" + identifier + "]";
    }
}
