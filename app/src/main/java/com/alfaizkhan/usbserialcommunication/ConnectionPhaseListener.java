package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for connection state phase changes.
 */
public interface ConnectionPhaseListener {
    void onEvent(String message, long timestamp);
}
