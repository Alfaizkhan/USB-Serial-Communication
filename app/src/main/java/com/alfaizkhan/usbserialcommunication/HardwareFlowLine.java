package com.alfaizkhan.usbserialcommunication;

public enum HardwareFlowLine {
    RTS("Request to Send", true),
    CTS("Clear to Send", false),
    DTR("Data Terminal Ready", true),
    DSR("Data Set Ready", false),
    CD("Carrier Detect", false),
    RI("Ring Indicator", false);

    private final String description;
    private final boolean isOutput;

    HardwareFlowLine(String description, boolean isOutput) {
        this.description = description;
        this.isOutput = isOutput;
    }

    public String getDescription() { return description; }
    public boolean isOutput() { return isOutput; }
}
