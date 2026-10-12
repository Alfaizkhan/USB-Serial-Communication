package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when additive checksum verification fails.
 */
public class ChecksumMismatchException extends IOException {
    public ChecksumMismatchException(String message) {
        super(message);
    }

    public ChecksumMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
