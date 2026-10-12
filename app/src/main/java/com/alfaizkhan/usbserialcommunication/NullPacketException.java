package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when attempting to transmit a null byte buffer.
 */
public class NullPacketException extends IOException {
    public NullPacketException(String message) {
        super(message);
    }

    public NullPacketException(String message, Throwable cause) {
        super(message, cause);
    }
}
