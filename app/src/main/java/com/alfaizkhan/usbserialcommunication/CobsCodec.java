package com.alfaizkhan.usbserialcommunication;

import java.io.ByteArrayOutputStream;

public final class CobsCodec {
    private CobsCodec() {}

    public static byte[] encode(byte[] src) {
        if (src == null || src.length == 0) return new byte[0];
        ByteArrayOutputStream dest = new ByteArrayOutputStream();
        int code = 1;
        int codeIndex = 0;
        dest.write(0);

        for (byte b : src) {
            if (b == 0) {
                byte[] current = dest.toByteArray();
                current[codeIndex] = (byte) code;
                dest.reset();
                dest.write(current, 0, current.length);
                codeIndex = dest.size();
                dest.write(0);
                code = 1;
            } else {
                dest.write(b);
                code++;
                if (code == 0xFF) {
                    byte[] current = dest.toByteArray();
                    current[codeIndex] = (byte) code;
                    dest.reset();
                    dest.write(current, 0, current.length);
                    codeIndex = dest.size();
                    dest.write(0);
                    code = 1;
                }
            }
        }
        byte[] result = dest.toByteArray();
        result[codeIndex] = (byte) code;
        return result;
    }
}
