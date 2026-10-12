package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when low-level USB control transfer fails.
 */
public class UsbControlTransferException extends IOException {
    public UsbControlTransferException(String message) {
        super(message);
    }

    public UsbControlTransferException(String message, Throwable cause) {
        super(message, cause);
    }
}
