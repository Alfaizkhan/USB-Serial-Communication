package com.alfaizkhan.usbserialcommunication;

public final class HexAsciiSplitter {
    private HexAsciiSplitter() {}

    public static String formatRow(byte[] data, int offset, int length) {
        StringBuilder hex = new StringBuilder();
        StringBuilder ascii = new StringBuilder();

        for (int i = 0; i < length && (offset + i) < data.length; i++) {
            byte b = data[offset + i];
            hex.append(String.format("%02X ", b & 0xFF));
            ascii.append(b >= 32 && b <= 126 ? (char) b : '.');
        }
        return hex.toString().trim() + " | " + ascii.toString();
    }
}
