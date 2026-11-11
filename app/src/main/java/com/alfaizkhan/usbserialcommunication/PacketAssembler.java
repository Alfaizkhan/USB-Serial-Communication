package com.alfaizkhan.usbserialcommunication;

import java.io.ByteArrayOutputStream;

public class PacketAssembler {
    private final byte startMarker;
    private final byte endMarker;
    private final ByteArrayOutputStream stream = new ByteArrayOutputStream();
    private boolean assembling = false;

    public PacketAssembler(byte startMarker, byte endMarker) {
        this.startMarker = startMarker;
        this.endMarker = endMarker;
    }

    public synchronized byte[] feed(byte b) {
        if (!assembling) {
            if (b == startMarker) {
                assembling = true;
                stream.reset();
                stream.write(b);
            }
        } else {
            stream.write(b);
            if (b == endMarker) {
                assembling = false;
                return stream.toByteArray();
            }
        }
        return null;
    }
}
