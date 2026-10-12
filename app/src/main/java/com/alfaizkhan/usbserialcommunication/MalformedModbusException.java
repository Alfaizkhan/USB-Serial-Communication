package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when Modbus RTU frame format is corrupt.
 */
public class MalformedModbusException extends IOException {
    public MalformedModbusException(String message) {
        super(message);
    }

    public MalformedModbusException(String message, Throwable cause) {
        super(message, cause);
    }
}
