package com.alfaizkhan.usbserialcommunication;

public final class XModemChecksum {
    private XModemChecksum() {}

    public static int computeChecksum8(byte[] data) {
        if (data == null) return 0;
        int sum = 0;
        for (byte b : data) {
            sum = (sum + (b & 0xFF)) & 0xFF;
        }
        return sum;
    }

    public static int computeCrc16(byte[] data) {
        if (data == null) return 0;
        int crc = 0;
        for (byte b : data) {
            crc = crc ^ ((b & 0xFF) << 8);
            for (int i = 0; i < 8; i++) {
                if ((crc & 0x8000) != 0) {
                    crc = ((crc << 1) ^ 0x1021) & 0xFFFF;
                } else {
                    crc = (crc << 1) & 0xFFFF;
                }
            }
        }
        return crc & 0xFFFF;
    }
}
