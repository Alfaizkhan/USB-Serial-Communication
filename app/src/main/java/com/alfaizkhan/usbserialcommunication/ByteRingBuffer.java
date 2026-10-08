package com.alfaizkhan.usbserialcommunication;

public class ByteRingBuffer {
    private final byte[] buffer;
    private int head = 0;
    private int tail = 0;
    private int count = 0;

    public ByteRingBuffer(int capacity) {
        this.buffer = new byte[capacity];
    }

    public synchronized boolean write(byte b) {
        if (count >= buffer.length) return false;
        buffer[tail] = b;
        tail = (tail + 1) % buffer.length;
        count++;
        return true;
    }

    public synchronized int write(byte[] src, int offset, int length) {
        int written = 0;
        for (int i = 0; i < length && count < buffer.length; i++) {
            write(src[offset + i]);
            written++;
        }
        return written;
    }

    public synchronized int read() {
        if (count == 0) return -1;
        int val = buffer[head] & 0xFF;
        head = (head + 1) % buffer.length;
        count--;
        return val;
    }

    public synchronized int size() {
        return count;
    }

    public synchronized int capacity() {
        return buffer.length;
    }

    public synchronized void clear() {
        head = 0;
        tail = 0;
        count = 0;
    }
}
