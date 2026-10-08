package com.alfaizkhan.usbserialcommunication;

public final class ByteOrderUtil {
    private ByteOrderUtil() {}

    public static short toShortLe(byte[] b, int offset) {
        return (short) ((b[offset] & 0xFF) | ((b[offset + 1] & 0xFF) << 8));
    }

    public static short toShortBe(byte[] b, int offset) {
        return (short) (((b[offset] & 0xFF) << 8) | (b[offset + 1] & 0xFF));
    }

    public static int toIntLe(byte[] b, int offset) {
        return (b[offset] & 0xFF)
                | ((b[offset + 1] & 0xFF) << 8)
                | ((b[offset + 2] & 0xFF) << 16)
                | ((b[offset + 3] & 0xFF) << 24);
    }

    public static int toIntBe(byte[] b, int offset) {
        return ((b[offset] & 0xFF) << 24)
                | ((b[offset + 1] & 0xFF) << 16)
                | ((b[offset + 2] & 0xFF) << 8)
                | (b[offset + 3] & 0xFF);
    }
}
