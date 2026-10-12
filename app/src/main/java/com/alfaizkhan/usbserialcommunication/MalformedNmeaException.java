package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when NMEA sentence syntax is invalid.
 */
public class MalformedNmeaException extends IOException {
    public MalformedNmeaException(String message) {
        super(message);
    }

    public MalformedNmeaException(String message, Throwable cause) {
        super(message, cause);
    }
}
