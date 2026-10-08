package com.alfaizkhan.usbserialcommunication;

public final class DelimiterFinder {
    private DelimiterFinder() {}

    public static int find(byte[] buffer, byte target, int offset, int length) {
        int end = Math.min(offset + length, buffer.length);
        for (int i = offset; i < end; i++) {
            if (buffer[i] == target) return i;
        }
        return -1;
    }
}
