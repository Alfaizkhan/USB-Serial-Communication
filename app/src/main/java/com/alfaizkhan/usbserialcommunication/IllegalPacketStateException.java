package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when packet parser enters an illegal state.
 */
public class IllegalPacketStateException extends IOException {
    public IllegalPacketStateException(String message) {
        super(message);
    }

    public IllegalPacketStateException(String message, Throwable cause) {
        super(message, cause);
    }
}
