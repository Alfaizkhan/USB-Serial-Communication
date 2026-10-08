package com.alfaizkhan.usbserialcommunication;

import java.util.Arrays;

public final class TelemetryFrame {
    public final byte header;
    public final byte[] payload;
    public final int checksum;

    public TelemetryFrame(byte header, byte[] payload, int checksum) {
        this.header = header;
        this.payload = payload != null ? Arrays.copyOf(payload, payload.length) : new byte[0];
        this.checksum = checksum;
    }
}
