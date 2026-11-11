package com.alfaizkhan.usbserialcommunication;

public final class IoCounterSnapshot {
    public final long timestamp;
    public final long bytesRx;
    public final long bytesTx;
    public final long packetsRx;
    public final long packetsTx;

    public IoCounterSnapshot(long bytesRx, long bytesTx, long packetsRx, long packetsTx) {
        this.timestamp = System.currentTimeMillis();
        this.bytesRx = bytesRx;
        this.bytesTx = bytesTx;
        this.packetsRx = packetsRx;
        this.packetsTx = packetsTx;
    }
}
