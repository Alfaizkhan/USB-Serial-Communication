package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when Android USB permission was rejected.
 */
public class PermissionDeniedException extends IOException {
    public PermissionDeniedException(String message) {
        super(message);
    }

    public PermissionDeniedException(String message, Throwable cause) {
        super(message, cause);
    }
}
