package com.alfaizkhan.usbserialcommunication;

/**
 * Listener callback interface for confirmed outbound packets.
 */
public interface PacketTransmittedListener {
    void onEvent(String message, long timestamp);
}
