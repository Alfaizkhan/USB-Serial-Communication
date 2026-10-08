package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

public class ParityException extends IOException {
    public ParityException(String message) {
        super(message);
    }
}
