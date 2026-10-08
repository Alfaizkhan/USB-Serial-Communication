package com.alfaizkhan.usbserialcommunication;

public interface SerialReadCallback {
    void onReadSuccess(byte[] data);
    void onReadFailure(Exception error);
}
