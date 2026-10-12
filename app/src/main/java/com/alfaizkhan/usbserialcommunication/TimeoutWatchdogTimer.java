package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * General serial inactivity watchdog timer.
 */
public final class TimeoutWatchdogTimer {
    private final String identifier;
    private final long timestamp;

    public TimeoutWatchdogTimer() {
        this("TimeoutWatchdogTimer");
    }

    public TimeoutWatchdogTimer(String identifier) {
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
        return "TimeoutWatchdogTimer[" + identifier + "]";
    }
}
