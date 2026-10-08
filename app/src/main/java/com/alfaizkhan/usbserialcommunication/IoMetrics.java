package com.alfaizkhan.usbserialcommunication;

import java.util.concurrent.atomic.AtomicLong;

public class IoMetrics {
    private final AtomicLong bytesReceived = new AtomicLong();
    private final AtomicLong bytesSent = new AtomicLong();
    private final AtomicLong packetsReceived = new AtomicLong();
    private final AtomicLong packetsSent = new AtomicLong();

    public void recordReceived(int bytes) {
        bytesReceived.addAndGet(bytes);
        packetsReceived.incrementAndGet();
    }

    public void recordSent(int bytes) {
        bytesSent.addAndGet(bytes);
        packetsSent.incrementAndGet();
    }

    public long getBytesReceived() { return bytesReceived.get(); }
    public long getBytesSent() { return bytesSent.get(); }
    public long getPacketsReceived() { return packetsReceived.get(); }
    public long getPacketsSent() { return packetsSent.get(); }

    public void reset() {
        bytesReceived.set(0);
        bytesSent.set(0);
        packetsReceived.set(0);
        packetsSent.set(0);
    }
}
