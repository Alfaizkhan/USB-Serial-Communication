package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when serial connection handshake times out.
 */
public class ConnectionTimeoutException extends IOException {
    public ConnectionTimeoutException(String message) {
        super(message);
    }

    public ConnectionTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }
}
