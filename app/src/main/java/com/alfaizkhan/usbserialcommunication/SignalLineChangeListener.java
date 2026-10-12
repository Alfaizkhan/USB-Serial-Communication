package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for RS-232 pin state toggles.
 */
public interface SignalLineChangeListener {
    void onEvent(String message, long timestamp);
}
