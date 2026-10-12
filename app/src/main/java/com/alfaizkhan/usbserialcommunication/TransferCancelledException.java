package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when an ongoing asynchronous transfer is cancelled.
 */
public class TransferCancelledException extends IOException {
    public TransferCancelledException(String message) {
        super(message);
    }

    public TransferCancelledException(String message, Throwable cause) {
        super(message, cause);
    }
}
