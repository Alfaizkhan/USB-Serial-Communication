package com.alfaizkhan.usbserialcommunication;

public enum ModbusFunctionCode {
    READ_COILS(0x01, "Read Coils"),
    READ_DISCRETE_INPUTS(0x02, "Read Discrete Inputs"),
    READ_HOLDING_REGISTERS(0x03, "Read Holding Registers"),
    READ_INPUT_REGISTERS(0x04, "Read Input Registers"),
    WRITE_SINGLE_COIL(0x05, "Write Single Coil"),
    WRITE_SINGLE_REGISTER(0x06, "Write Single Register");

    private final int code;
    private final String description;

    ModbusFunctionCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() { return code; }
    public String getDescription() { return description; }
}
