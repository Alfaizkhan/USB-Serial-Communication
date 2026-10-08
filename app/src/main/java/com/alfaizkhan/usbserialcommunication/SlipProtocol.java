package com.alfaizkhan.usbserialcommunication;

import java.io.ByteArrayOutputStream;

public final class SlipProtocol {
    public static final byte END = (byte) 0xC0;
    public static final byte ESC = (byte) 0xDB;
    public static final byte ESC_END = (byte) 0xDC;
    public static final byte ESC_ESC = (byte) 0xDD;

    private SlipProtocol() {}

    public static byte[] encode(byte[] packet) {
        if (packet == null) return new byte[]{END};
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(END);
        for (byte b : packet) {
            if (b == END) {
                out.write(ESC);
                out.write(ESC_END);
            } else if (b == ESC) {
                out.write(ESC);
                out.write(ESC_ESC);
            } else {
                out.write(b);
            }
        }
        out.write(END);
        return out.toByteArray();
    }
}
