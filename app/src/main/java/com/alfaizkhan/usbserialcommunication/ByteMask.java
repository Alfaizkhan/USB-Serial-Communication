package com.alfaizkhan.usbserialcommunication;

public final class ByteMask {
    public static final int BIT0 = 0x01;
    public static final int BIT1 = 0x02;
    public static final int BIT2 = 0x04;
    public static final int BIT3 = 0x08;
    public static final int BIT4 = 0x10;
    public static final int BIT5 = 0x20;
    public static final int BIT6 = 0x40;
    public static final int BIT7 = 0x80;

    private ByteMask() {}

    public static int mask(int numBits) {
        if (numBits <= 0) return 0;
        if (numBits >= 32) return 0xFFFFFFFF;
        return (1 << numBits) - 1;
    }
}
