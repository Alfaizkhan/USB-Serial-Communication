package com.alfaizkhan.usbserialcommunication;

import java.util.zip.CRC32;

public final class Crc32Util {
    private Crc32Util() {}

    public static long compute(byte[] data) {
        if (data == null) return 0L;
        return compute(data, 0, data.length);
    }

    public static long compute(byte[] data, int offset, int length) {
        CRC32 crc = new CRC32();
        crc.update(data, offset, length);
        return crc.getValue();
    }
}
