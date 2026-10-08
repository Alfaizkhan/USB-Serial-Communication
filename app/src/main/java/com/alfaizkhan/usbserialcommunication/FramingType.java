package com.alfaizkhan.usbserialcommunication;

public enum FramingType {
    RAW("Raw Stream"),
    LINE_DELIMITED("Line Delimited (CR/LF)"),
    SLIP("SLIP Protocol"),
    COBS("COBS Zero-Delimited"),
    FIXED_LENGTH("Fixed Length");

    private final String description;

    FramingType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
