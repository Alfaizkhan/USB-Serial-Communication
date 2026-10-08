package com.alfaizkhan.usbserialcommunication;

public final class HexFormatter {
    private HexFormatter() {}

    public static String toHex(byte[] bytes) {
        return toHex(bytes, " ", false);
    }

    public static String toHex(byte[] bytes, String delimiter, boolean upperCase) {
        if (bytes == null || bytes.length == 0) return "";
        StringBuilder sb = new StringBuilder(bytes.length * 3);
        String format = upperCase ? "%02X" : "%02x";
        for (int i = 0; i < bytes.length; i++) {
            if (i > 0 && delimiter != null) {
                sb.append(delimiter);
            }
            sb.append(String.format(format, bytes[i] & 0xFF));
        }
        return sb.toString();
    }
}
