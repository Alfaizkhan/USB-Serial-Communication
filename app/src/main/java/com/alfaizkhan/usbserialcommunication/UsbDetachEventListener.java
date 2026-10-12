package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for USB unplug events.
 */
public interface UsbDetachEventListener {
    void onEvent(String message, long timestamp);
}
