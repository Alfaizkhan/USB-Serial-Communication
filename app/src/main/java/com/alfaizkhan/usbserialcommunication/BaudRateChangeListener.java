package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for baud rate reconfiguration.
 */
public interface BaudRateChangeListener {
    void onEvent(String message, long timestamp);
}
