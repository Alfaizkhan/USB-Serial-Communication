package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when non-hex character is encountered.
 */
public class InvalidHexCharacterException extends IOException {
    public InvalidHexCharacterException(String message) {
        super(message);
    }

    public InvalidHexCharacterException(String message, Throwable cause) {
        super(message, cause);
    }
}
