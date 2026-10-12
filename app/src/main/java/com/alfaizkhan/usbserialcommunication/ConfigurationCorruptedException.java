package com.alfaizkhan.usbserialcommunication;

import java.io.IOException;

/**
 * Exception thrown when user preference data fails validation.
 */
public class ConfigurationCorruptedException extends IOException {
    public ConfigurationCorruptedException(String message) {
        super(message);
    }

    public ConfigurationCorruptedException(String message, Throwable cause) {
        super(message, cause);
    }
}
