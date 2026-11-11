package com.alfaizkhan.usbserialcommunication;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PacketLengthDecoder {
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    public synchronized List<byte[]> process(byte[] incoming) {
        List<byte[]> packets = new ArrayList<>();
        if (incoming == null) return packets;

        for (byte b : incoming) {
            buffer.write(b);
            byte[] current = buffer.toByteArray();
            if (current.length >= 2) {
                int expectedLen = ((current[0] & 0xFF) << 8) | (current[1] & 0xFF);
                if (current.length >= 2 + expectedLen) {
                    byte[] packet = new byte[expectedLen];
                    System.arraycopy(current, 2, packet, 0, expectedLen);
                    packets.add(packet);
                    buffer.reset();
                }
            }
        }
        return packets;
    }
}
