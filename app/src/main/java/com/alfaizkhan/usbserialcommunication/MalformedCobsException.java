package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when COBS packet zero-delimiting is corrupt.
 */
public class MalformedCobsException extends IOException {
    public MalformedCobsException(String message) {
        super(message);
    }

    public MalformedCobsException(String message, Throwable cause) {
        super(message, cause);
    }
}
