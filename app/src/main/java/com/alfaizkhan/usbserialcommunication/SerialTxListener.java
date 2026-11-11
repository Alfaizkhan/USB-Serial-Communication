package com.alfaizkhan.usbserialcommunication;

@FunctionalInterface
public interface SerialTxListener {
    void onBytesSent(int count);
}
