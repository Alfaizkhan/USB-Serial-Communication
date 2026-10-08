package com.alfaizkhan.usbserialcommunication;

public final class SerialPortInfo {
    public final int portNumber;
    public final String driverType;
    public final boolean isOpen;

    public SerialPortInfo(int portNumber, String driverType, boolean isOpen) {
        this.portNumber = portNumber;
        this.driverType = driverType;
        this.isOpen = isOpen;
    }

    public String getDisplayName() {
        return String.format("%s (Port %d)", driverType, portNumber);
    }
}
