package com.alfaizkhan.usbserialcommunication;

/**
 * Text style attributes (bold, italic, underline) bitmask.
 */
public enum TerminalTextAttribute {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
