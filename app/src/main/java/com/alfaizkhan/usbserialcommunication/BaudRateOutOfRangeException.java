package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when baud rate exceeds hardware limits.
 */
public class BaudRateOutOfRangeException extends IOException {
    public BaudRateOutOfRangeException(String message) {
        super(message);
    }

    public BaudRateOutOfRangeException(String message, Throwable cause) {
        super(message, cause);
    }
}
