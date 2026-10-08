package com.alfaizkhan.usbserialcommunication;

public final class BreakDurationCalculator {
    private BreakDurationCalculator() {}

    public static long calculateMinBreakMicros(int baudRate, int frameBits) {
        if (baudRate <= 0 || frameBits <= 0) return 1000;
        return (1_000_000L * frameBits) / baudRate;
    }
}
