package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when requested stop bits are not valid.
 */
public class UnsupportedStopBitsException extends IOException {
    public UnsupportedStopBitsException(String message) {
        super(message);
    }

    public UnsupportedStopBitsException(String message, Throwable cause) {
        super(message, cause);
    }
}
