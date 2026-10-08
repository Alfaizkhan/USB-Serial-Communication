package com.alfaizkhan.usbserialcommunication;

public class RateLimiter {
    private final long minIntervalMillis;
    private long lastExecutionTime = 0;

    public RateLimiter(long minIntervalMillis) {
        this.minIntervalMillis = minIntervalMillis;
    }

    public synchronized boolean tryAcquire() {
        long now = System.currentTimeMillis();
        if (now - lastExecutionTime >= minIntervalMillis) {
            lastExecutionTime = now;
            return true;
        }
        return false;
    }

    public synchronized void reset() {
        lastExecutionTime = 0;
    }
}
