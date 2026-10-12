package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when requested USB device is not attached.
 */
public class DeviceNotFoundException extends IOException {
    public DeviceNotFoundException(String message) {
        super(message);
    }

    public DeviceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
