package com.alfaizkhan.usbserialcommunication;

import java.util.ArrayDeque;

public class SerialBufferQueue {
    public enum DropPolicy { DROP_OLDEST, DROP_NEWEST }

    private final int maxCapacity;
    private final DropPolicy policy;
    private final ArrayDeque<byte[]> queue;

    public SerialBufferQueue(int maxCapacity, DropPolicy policy) {
        this.maxCapacity = maxCapacity;
        this.policy = policy;
        this.queue = new ArrayDeque<>(maxCapacity);
    }

    public synchronized boolean enqueue(byte[] data) {
        if (queue.size() >= maxCapacity) {
            if (policy == DropPolicy.DROP_OLDEST) {
                queue.pollFirst();
            } else {
                return false;
            }
        }
        queue.addLast(data);
        return true;
    }

    public synchronized byte[] dequeue() {
        return queue.pollFirst();
    }

    public synchronized int size() {
        return queue.size();
    }

    public synchronized void clear() {
        queue.clear();
    }
}
