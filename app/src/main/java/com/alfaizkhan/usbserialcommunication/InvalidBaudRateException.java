package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when specified baud rate is not supported.
 */
public class InvalidBaudRateException extends IOException {
    public InvalidBaudRateException(String message) {
        super(message);
    }

    public InvalidBaudRateException(String message, Throwable cause) {
        super(message, cause);
    }
}
