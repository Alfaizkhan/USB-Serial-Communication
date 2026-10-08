package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

public class SerialConnectionException extends IOException {
    public SerialConnectionException(String message) {
        super(message);
    }

    public SerialConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
