package com.alfaizkhan.usbserialcommunication;

public class ByteFrequencyCounter {
    private final long[] frequencies = new long[256];

    public synchronized void record(byte[] data) {
        if (data == null) return;
        for (byte b : data) {
            frequencies[b & 0xFF]++;
        }
    }

    public synchronized long getCount(int byteValue) {
        if (byteValue < 0 || byteValue > 255) return 0;
        return frequencies[byteValue];
    }

    public synchronized void reset() {
        for (int i = 0; i < 256; i++) {
            frequencies[i] = 0;
        }
    }
}
