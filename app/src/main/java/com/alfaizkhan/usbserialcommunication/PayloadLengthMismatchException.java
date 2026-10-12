package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when packet length header mismatches data.
 */
public class PayloadLengthMismatchException extends IOException {
    public PayloadLengthMismatchException(String message) {
        super(message);
    }

    public PayloadLengthMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
