package com.alfaizkhan.usbserialcommunication;

public final class ModbusCrc {
    private ModbusCrc() {}

    public static int calculate(byte[] buffer) {
        if (buffer == null) return 0;
        return calculate(buffer, 0, buffer.length);
    }

    public static int calculate(byte[] buffer, int offset, int length) {
        int crc = 0xFFFF;
        for (int i = offset; i < offset + length; i++) {
            crc ^= (buffer[i] & 0xFF);
            for (int j = 0; j < 8; j++) {
                if ((crc & 1) != 0) {
                    crc = (crc >> 1) ^ 0xA001;
                } else {
                    crc >>= 1;
                }
            }
        }
        return crc;
    }
}
