package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for USB plug events.
 */
public interface UsbAttachEventListener {
    void onEvent(String message, long timestamp);
}
