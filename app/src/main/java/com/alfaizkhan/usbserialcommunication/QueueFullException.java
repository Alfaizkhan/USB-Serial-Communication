package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when inserting into a bounded queue at capacity.
 */
public class QueueFullException extends IOException {
    public QueueFullException(String message) {
        super(message);
    }

    public QueueFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
