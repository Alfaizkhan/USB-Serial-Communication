package com.alfaizkhan.usbserialcommunication;

public enum RingBufferOverflowStrategy {
    OVERWRITE_OLDEST,
    DISCARD_INCOMING,
    BLOCK_CALLER
}
