package com.alfaizkhan.usbserialcommunication;

public final class Crc16Util {
    private Crc16Util() {}

    public static int computeModbus(byte[] data, int offset, int length) {
        int crc = 0xFFFF;
        for (int i = offset; i < offset + length; i++) {
            crc ^= (data[i] & 0xFF);
            for (int j = 0; j < 8; j++) {
                if ((crc & 0x0001) != 0) {
                    crc = (crc >> 1) ^ 0xA001;
                } else {
                    crc >>= 1;
                }
            }
        }
        return crc & 0xFFFF;
    }

    public static int computeCcitt(byte[] data, int offset, int length) {
        int crc = 0xFFFF;
        for (int i = offset; i < offset + length; i++) {
            crc = ((crc >> 8) | (crc << 8)) & 0xFFFF;
            crc ^= (data[i] & 0xFF);
            crc ^= ((crc & 0xFF) >> 4);
            crc ^= ((crc << 12) & 0xFFFF);
            crc ^= (((crc & 0xFF) << 5) & 0xFFFF);
        }
        return crc & 0xFFFF;
    }
}
