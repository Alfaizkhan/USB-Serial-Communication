package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when reading from an empty byte buffer.
 */
public class BufferUnderflowException extends IOException {
    public BufferUnderflowException(String message) {
        super(message);
    }

    public BufferUnderflowException(String message, Throwable cause) {
        super(message, cause);
    }
}
