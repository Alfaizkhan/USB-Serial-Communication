package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when USB interface claim operation fails.
 */
public class UsbClaimInterfaceException extends IOException {
    public UsbClaimInterfaceException(String message) {
        super(message);
    }

    public UsbClaimInterfaceException(String message, Throwable cause) {
        super(message, cause);
    }
}
