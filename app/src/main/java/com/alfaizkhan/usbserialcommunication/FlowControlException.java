package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

public class FlowControlException extends IOException {
    public FlowControlException(String message) {
        super(message);
    }
}
