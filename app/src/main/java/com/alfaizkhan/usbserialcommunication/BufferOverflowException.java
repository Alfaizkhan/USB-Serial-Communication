package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

public class BufferOverflowException extends IOException {
    public BufferOverflowException(String message) {
        super(message);
    }
}
