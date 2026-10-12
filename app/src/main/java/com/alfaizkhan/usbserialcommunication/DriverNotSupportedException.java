package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when device chipset has no compatible driver.
 */
public class DriverNotSupportedException extends IOException {
    public DriverNotSupportedException(String message) {
        super(message);
    }

    public DriverNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
}
