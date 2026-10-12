package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when requested data bits are not valid.
 */
public class UnsupportedDataBitsException extends IOException {
    public UnsupportedDataBitsException(String message) {
        super(message);
    }

    public UnsupportedDataBitsException(String message, Throwable cause) {
        super(message, cause);
    }
}
