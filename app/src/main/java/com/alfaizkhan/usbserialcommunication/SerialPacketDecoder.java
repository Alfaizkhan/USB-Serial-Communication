package com.alfaizkhan.usbserialcommunication;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialPacketDecoder {
    private final byte delimiter;
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    public SerialPacketDecoder(byte delimiter) {
        this.delimiter = delimiter;
    }

    public synchronized List<byte[]> process(byte[] incoming) {
        List<byte[]> packets = new ArrayList<>();
        if (incoming == null) return packets;

        for (byte b : incoming) {
            buffer.write(b);
            if (b == delimiter) {
                packets.add(buffer.toByteArray());
                buffer.reset();
            }
        }
        return packets;
    }

    public synchronized void reset() {
        buffer.reset();
    }
}
