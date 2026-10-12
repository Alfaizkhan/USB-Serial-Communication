package com.alfaizkhan.usbserialcommunication;

/**
 * Callback listener interface for telemetry stream events.
 */
public interface TelemetryEventListener {
    void onEvent(String message, long timestamp);
}
