package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when attempting to open an active device.
 */
public class DeviceAlreadyOpenException extends IOException {
    public DeviceAlreadyOpenException(String message) {
        super(message);
    }

    public DeviceAlreadyOpenException(String message, Throwable cause) {
        super(message, cause);
    }
}
