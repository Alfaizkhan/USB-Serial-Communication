package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when USB descriptor binary data is corrupt.
 */
public class InvalidDescriptorException extends IOException {
    public InvalidDescriptorException(String message) {
        super(message);
    }

    public InvalidDescriptorException(String message, Throwable cause) {
        super(message, cause);
    }
}
