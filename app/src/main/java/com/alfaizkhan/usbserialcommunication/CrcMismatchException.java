package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when verified CRC checksum does not match.
 */
public class CrcMismatchException extends IOException {
    public CrcMismatchException(String message) {
        super(message);
    }

    public CrcMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
