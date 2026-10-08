package com.alfaizkhan.usbserialcommunication;

public final class SerialPortNameFormatter {
    private SerialPortNameFormatter() {}

    public static String cleanDriverName(String rawDriverClassName) {
        if (rawDriverClassName == null) return "Unknown";
        return rawDriverClassName
                .replace("SerialDriver", "")
                .replace("UsbSerialDriver", "")
                .trim();
    }
}
