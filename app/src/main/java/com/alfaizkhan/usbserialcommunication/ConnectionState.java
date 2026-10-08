package com.alfaizkhan.usbserialcommunication;

public enum ConnectionState {
    DISCONNECTED,
    CONNECTING,
    CONNECTED,
    DISCONNECTING,
    ERROR;

    public boolean isConnected() {
        return this == CONNECTED;
    }

    public boolean canConnect() {
        return this == DISCONNECTED || this == ERROR;
    }
}
