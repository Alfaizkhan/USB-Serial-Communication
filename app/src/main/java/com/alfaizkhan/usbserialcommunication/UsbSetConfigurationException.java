package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when USB configuration selection fails.
 */
public class UsbSetConfigurationException extends IOException {
    public UsbSetConfigurationException(String message) {
        super(message);
    }

    public UsbSetConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
