package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for periodic throughput metrics.
 */
public interface TelemetryUpdateListener {
    void onEvent(String message, long timestamp);
}
