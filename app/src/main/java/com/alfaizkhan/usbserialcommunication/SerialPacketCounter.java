package com.alfaizkhan.usbserialcommunication;

public class SerialPacketCounter {
    private long lastTimeMillis = System.currentTimeMillis();
    private int packetCount = 0;
    private double currentPps = 0.0;

    public synchronized void recordPacket() {
        packetCount++;
        long now = System.currentTimeMillis();
        long elapsed = now - lastTimeMillis;
        if (elapsed >= 1000) {
            currentPps = (packetCount * 1000.0) / elapsed;
            packetCount = 0;
            lastTimeMillis = now;
        }
    }

    public synchronized double getPacketsPerSecond() {
        return currentPps;
    }
}
