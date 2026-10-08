package com.alfaizkhan.usbserialcommunication;

public final class TerminalStatusMessage {
    private TerminalStatusMessage() {}

    public static String connected(String deviceName, int baudRate) {
        return String.format("Connected to %s at %d baud", deviceName, baudRate);
    }

    public static String disconnected() {
        return "Disconnected from serial device";
    }
}
