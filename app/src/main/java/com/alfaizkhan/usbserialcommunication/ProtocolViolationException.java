package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when serial peer violates protocol rules.
 */
public class ProtocolViolationException extends IOException {
    public ProtocolViolationException(String message) {
        super(message);
    }

    public ProtocolViolationException(String message, Throwable cause) {
        super(message, cause);
    }
}
