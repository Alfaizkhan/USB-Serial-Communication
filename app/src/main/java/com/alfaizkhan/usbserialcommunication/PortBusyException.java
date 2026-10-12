package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when serial port is locked by another process.
 */
public class PortBusyException extends IOException {
    public PortBusyException(String message) {
        super(message);
    }

    public PortBusyException(String message, Throwable cause) {
        super(message, cause);
    }
}
