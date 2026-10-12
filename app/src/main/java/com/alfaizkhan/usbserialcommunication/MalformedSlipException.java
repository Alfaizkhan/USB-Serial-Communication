package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when SLIP byte escaping sequence is broken.
 */
public class MalformedSlipException extends IOException {
    public MalformedSlipException(String message) {
        super(message);
    }

    public MalformedSlipException(String message, Throwable cause) {
        super(message, cause);
    }
}
