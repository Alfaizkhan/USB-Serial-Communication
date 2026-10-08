package com.alfaizkhan.usbserialcommunication;

public final class SerialPortParams {
    private SerialPortParams() {}

    public static String format(int baud, int dataBits, int stopBits, String parity) {
        String stopStr = (stopBits == 1) ? "1" : (stopBits == 2 ? "2" : "1.5");
        String parChar = (parity != null && !parity.isEmpty()) ? parity.substring(0, 1).toUpperCase() : "N";
        return String.format("%d %d%s%s", baud, dataBits, parChar, stopStr);
    }
}
