package com.alfaizkhan.usbserialcommunication;

public final class SerialBaudUtils {
    private SerialBaudUtils() {}

    public static double getByteDurationMillis(int baudRate) {
        if (baudRate <= 0) return 0.0;
        return (10.0 * 1000.0) / baudRate;
    }
}
