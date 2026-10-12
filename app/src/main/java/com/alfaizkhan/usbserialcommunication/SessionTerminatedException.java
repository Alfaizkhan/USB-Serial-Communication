package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when operations occur after session close.
 */
public class SessionTerminatedException extends IOException {
    public SessionTerminatedException(String message) {
        super(message);
    }

    public SessionTerminatedException(String message, Throwable cause) {
        super(message, cause);
    }
}
