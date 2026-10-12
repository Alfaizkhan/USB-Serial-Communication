package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when flow control is unsupported.
 */
public class UnsupportedFlowControlException extends IOException {
    public UnsupportedFlowControlException(String message) {
        super(message);
    }

    public UnsupportedFlowControlException(String message, Throwable cause) {
        super(message, cause);
    }
}
