package com.alfaizkhan.usbserialcommunication;

public final class ParityCalculator {
    private ParityCalculator() {}

    public static boolean computeEvenParity(byte b) {
        int count = Integer.bitCount(b & 0xFF);
        return (count % 2) != 0;
    }

    public static boolean computeOddParity(byte b) {
        return !computeEvenParity(b);
    }
}
