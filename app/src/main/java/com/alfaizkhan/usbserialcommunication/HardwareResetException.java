package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when microcontroller reports a brownout or reset.
 */
public class HardwareResetException extends IOException {
    public HardwareResetException(String message) {
        super(message);
    }

    public HardwareResetException(String message, Throwable cause) {
        super(message, cause);
    }
}
