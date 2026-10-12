package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when device VID/PID is unknown.
 */
public class UnrecognizedVidPidException extends IOException {
    public UnrecognizedVidPidException(String message) {
        super(message);
    }

    public UnrecognizedVidPidException(String message, Throwable cause) {
        super(message, cause);
    }
}
