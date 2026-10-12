package com.alfaizkhan.usbserialcommunication;

/**
 * Callback interface triggered when queue drains empty.
 */
public interface BufferDrainListener {
    void onEvent(String message, long timestamp);
}
