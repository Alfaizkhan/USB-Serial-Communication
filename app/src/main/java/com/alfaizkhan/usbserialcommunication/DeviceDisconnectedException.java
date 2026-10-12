package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when USB hardware is unplugged mid-transfer.
 */
public class DeviceDisconnectedException extends IOException {
    public DeviceDisconnectedException(String message) {
        super(message);
    }

    public DeviceDisconnectedException(String message, Throwable cause) {
        super(message, cause);
    }
}
