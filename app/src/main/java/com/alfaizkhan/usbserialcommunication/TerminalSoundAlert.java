package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ASCII 0x07 BEL character audio alert handler.
 */
public final class TerminalSoundAlert {
    private final String identifier;
    private final long timestamp;

    public TerminalSoundAlert() {
        this("TerminalSoundAlert");
    }

    public TerminalSoundAlert(String identifier) {
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
        return "TerminalSoundAlert[" + identifier + "]";
    }
}
