package com.alfaizkhan.usbserialcommunication;

public enum StopBits {
    ONE(1, "1"),
    ONE_POINT_FIVE(3, "1.5"),
    TWO(2, "2");

    private final int value;
    private final String label;

    StopBits(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }
}
