package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when incoming frame terminates unexpectedly.
 */
public class PacketTruncatedException extends IOException {
    public PacketTruncatedException(String message) {
        super(message);
    }

    public PacketTruncatedException(String message, Throwable cause) {
        super(message, cause);
    }
}
