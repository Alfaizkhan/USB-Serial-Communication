package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for complete decoded packets.
 */
public interface PacketReceivedListener {
    void onEvent(String message, long timestamp);
}
