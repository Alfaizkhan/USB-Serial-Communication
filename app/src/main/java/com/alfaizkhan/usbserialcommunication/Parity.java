package com.alfaizkhan.usbserialcommunication;

public enum Parity {
    NONE(0, "None"),
    ODD(1, "Odd"),
    EVEN(2, "Even"),
    MARK(3, "Mark"),
    SPACE(4, "Space");

    private final int value;
    private final String label;

    Parity(int value, String label) {
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
