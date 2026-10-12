package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for buffer low/high watermarks.
 */
public interface BufferThresholdListener {
    void onEvent(String message, long timestamp);
}
