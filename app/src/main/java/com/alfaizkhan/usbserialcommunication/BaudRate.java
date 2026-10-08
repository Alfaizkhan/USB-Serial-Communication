package com.alfaizkhan.usbserialcommunication;

public enum BaudRate {
    B300(300),
    B600(600),
    B1200(1200),
    B2400(2400),
    B4800(4800),
    B9600(9600),
    B19200(19200),
    B38400(38400),
    B57600(57600),
    B115200(115200),
    B230400(230400),
    B460800(460800),
    B921600(921600);

    private final int rate;

    BaudRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public static BaudRate fromInt(int value, BaudRate defaultRate) {
        for (BaudRate b : values()) {
            if (b.rate == value) return b;
        }
        return defaultRate;
    }

    public static boolean isValid(int rate) {
        for (BaudRate b : values()) {
            if (b.rate == rate) return true;
        }
        return rate > 0;
    }
}
