package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for serial port open and close events.
 */
public interface PortStateListener {
    void onEvent(String message, long timestamp);
}
