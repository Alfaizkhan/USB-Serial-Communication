package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for protocol-level parsed messages.
 */
public interface ProtocolFrameListener {
    void onEvent(String message, long timestamp);
}
