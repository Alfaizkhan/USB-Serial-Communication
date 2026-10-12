package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when requested parity mode is not valid.
 */
public class UnsupportedParityException extends IOException {
    public UnsupportedParityException(String message) {
        super(message);
    }

    public UnsupportedParityException(String message, Throwable cause) {
        super(message, cause);
    }
}
