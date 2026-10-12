package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when packet framing structure is malformed.
 */
public class FramingCorruptedException extends IOException {
    public FramingCorruptedException(String message) {
        super(message);
    }

    public FramingCorruptedException(String message, Throwable cause) {
        super(message, cause);
    }
}
