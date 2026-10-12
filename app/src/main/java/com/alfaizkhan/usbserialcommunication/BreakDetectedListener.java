package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for UART break condition events.
 */
public interface BreakDetectedListener {
    void onEvent(String message, long timestamp);
}
