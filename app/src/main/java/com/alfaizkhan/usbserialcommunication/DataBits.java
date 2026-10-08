package com.alfaizkhan.usbserialcommunication;

public enum DataBits {
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8);

    private final int value;

    DataBits(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static DataBits fromInt(int value) {
        for (DataBits db : values()) {
            if (db.value == value) return db;
        }
        return EIGHT;
    }
}
