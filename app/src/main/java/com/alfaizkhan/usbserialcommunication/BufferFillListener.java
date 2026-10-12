package com.alfaizkhan.usbserialcommunication;

/**
 * Callback interface triggered when queue reaches threshold.
 */
public interface BufferFillListener {
    void onEvent(String message, long timestamp);
}
