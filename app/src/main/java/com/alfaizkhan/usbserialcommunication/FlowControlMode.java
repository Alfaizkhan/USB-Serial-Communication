package com.alfaizkhan.usbserialcommunication;

public enum FlowControlMode {
    NONE("None"),
    RTS_CTS("RTS/CTS (Hardware)"),
    DTR_DSR("DTR/DSR (Hardware)"),
    XON_XOFF("XON/XOFF (Software)");

    private final String label;

    FlowControlMode(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public boolean isHardware() {
        return this == RTS_CTS || this == DTR_DSR;
    }

    public boolean isSoftware() {
        return this == XON_XOFF;
    }
}
