package com.alfaizkhan.usbserialcommunication;

import java.io.ByteArrayOutputStream;

public class ByteArrayBuilder {
    private final ByteArrayOutputStream stream = new ByteArrayOutputStream();

    public ByteArrayBuilder appendByte(int b) {
        stream.write(b & 0xFF);
        return this;
    }

    public ByteArrayBuilder appendBytes(byte[] data) {
        if (data != null) {
            stream.write(data, 0, data.length);
        }
        return this;
    }

    public ByteArrayBuilder appendShortBe(int s) {
        stream.write((s >> 8) & 0xFF);
        stream.write(s & 0xFF);
        return this;
    }

    public ByteArrayBuilder appendIntBe(int i) {
        stream.write((i >> 24) & 0xFF);
        stream.write((i >> 16) & 0xFF);
        stream.write((i >> 8) & 0xFF);
        stream.write(i & 0xFF);
        return this;
    }

    public byte[] toByteArray() {
        return stream.toByteArray();
    }

    public int size() {
        return stream.size();
    }

    public void clear() {
        stream.reset();
    }
}
