package com.alfaizkhan.usbserialcommunication;

import java.util.concurrent.atomic.AtomicLong;

public class PacketStatistics {
    public final AtomicLong framingErrors = new AtomicLong();
    public final AtomicLong overrunErrors = new AtomicLong();
    public final AtomicLong parityErrors = new AtomicLong();
    public final AtomicLong breakDetections = new AtomicLong();

    public void reset() {
        framingErrors.set(0);
        overrunErrors.set(0);
        parityErrors.set(0);
        breakDetections.set(0);
    }
}
