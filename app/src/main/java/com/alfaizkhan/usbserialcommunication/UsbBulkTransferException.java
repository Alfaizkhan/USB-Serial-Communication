package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when low-level USB bulk transfer fails.
 */
public class UsbBulkTransferException extends IOException {
    public UsbBulkTransferException(String message) {
        super(message);
    }

    public UsbBulkTransferException(String message, Throwable cause) {
        super(message, cause);
    }
}
