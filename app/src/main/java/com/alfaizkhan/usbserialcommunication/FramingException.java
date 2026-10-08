package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

public class FramingException extends IOException {
    public FramingException(String message) {
        super(message);
    }
}
