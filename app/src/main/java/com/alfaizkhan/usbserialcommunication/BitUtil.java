package com.alfaizkhan.usbserialcommunication;

public final class BitUtil {
    private BitUtil() {}

    public static boolean isBitSet(int value, int bitIndex) {
        return (value & (1 << bitIndex)) != 0;
    }

    public static int setBit(int value, int bitIndex) {
        return value | (1 << bitIndex);
    }

    public static int clearBit(int value, int bitIndex) {
        return value & ~(1 << bitIndex);
    }

    public static int toggleBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex);
    }
}
