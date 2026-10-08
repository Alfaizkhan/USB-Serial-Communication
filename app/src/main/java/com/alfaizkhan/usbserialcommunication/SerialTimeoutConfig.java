package com.alfaizkhan.usbserialcommunication;

public final class SerialTimeoutConfig {
    public final int readTimeoutMillis;
    public final int writeTimeoutMillis;

    public SerialTimeoutConfig(int readTimeoutMillis, int writeTimeoutMillis) {
        this.readTimeoutMillis = readTimeoutMillis;
        this.writeTimeoutMillis = writeTimeoutMillis;
    }

    public static SerialTimeoutConfig standard() {
        return new SerialTimeoutConfig(0, 200);
    }
}
