package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

public class ChecksumException extends IOException {
    public ChecksumException(String message) {
        super(message);
    }
}
