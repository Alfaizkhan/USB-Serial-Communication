package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when operation is invalid for current state.
 */
public class OperationNotPermittedException extends IOException {
    public OperationNotPermittedException(String message) {
        super(message);
    }

    public OperationNotPermittedException(String message, Throwable cause) {
        super(message, cause);
    }
}
