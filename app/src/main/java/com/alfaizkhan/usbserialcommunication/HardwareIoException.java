package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * General hardware I/O exception for serial communication errors.
 */
public class HardwareIoException extends IOException {
    public HardwareIoException(String message) {
        super(message);
    }

    public HardwareIoException(String message, Throwable cause) {
        super(message, cause);
    }
}
