package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for asynchronous hardware errors.
 */
public interface ErrorNotificationListener {
    void onEvent(String message, long timestamp);
}
