package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when required Bulk IN/OUT endpoint is missing.
 */
public class UsbEndpointNotFoundException extends IOException {
    public UsbEndpointNotFoundException(String message) {
        super(message);
    }

    public UsbEndpointNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
