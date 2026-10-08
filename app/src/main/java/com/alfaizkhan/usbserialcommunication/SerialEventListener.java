package com.alfaizkhan.usbserialcommunication;

public interface SerialEventListener {
    void onConnectionOpened();
    void onConnectionClosed();
    void onDataReceived(byte[] data);
    void onError(Exception error);
}
