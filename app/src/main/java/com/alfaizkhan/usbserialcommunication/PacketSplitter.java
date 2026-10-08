package com.alfaizkhan.usbserialcommunication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PacketSplitter {
    private PacketSplitter() {}

    public static List<byte[]> split(byte[] data, int maxChunkSize) {
        List<byte[]> chunks = new ArrayList<>();
        if (data == null || data.length == 0 || maxChunkSize <= 0) return chunks;

        for (int i = 0; i < data.length; i += maxChunkSize) {
            int end = Math.min(i + maxChunkSize, data.length);
            chunks.add(Arrays.copyOfRange(data, i, end));
        }
        return chunks;
    }
}
