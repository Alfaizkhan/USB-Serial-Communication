package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when memory or buffer limits are exceeded.
 */
public class ResourceExhaustedException extends IOException {
    public ResourceExhaustedException(String message) {
        super(message);
    }

    public ResourceExhaustedException(String message, Throwable cause) {
        super(message, cause);
    }
}
