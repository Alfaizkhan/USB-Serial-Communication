package com.alfaizkhan.usbserialcommunication;

import java.io.InputStream;
import java.util.ArrayDeque;

public class ChunkedInputStream extends InputStream {
    private final ArrayDeque<byte[]> chunks = new ArrayDeque<>();
    private byte[] currentChunk = null;
    private int currentOffset = 0;

    public synchronized void addChunk(byte[] chunk) {
        if (chunk != null && chunk.length > 0) {
            chunks.addLast(chunk);
        }
    }

    @Override
    public synchronized int read() {
        while (currentChunk == null || currentOffset >= currentChunk.length) {
            if (chunks.isEmpty()) return -1;
            currentChunk = chunks.pollFirst();
            currentOffset = 0;
        }
        return currentChunk[currentOffset++] & 0xFF;
    }
}
