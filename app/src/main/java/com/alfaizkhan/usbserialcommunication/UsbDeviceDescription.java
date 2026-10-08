package com.alfaizkhan.usbserialcommunication;

public final class UsbDeviceDescription {
    public final int vendorId;
    public final int productId;
    public final String deviceName;
    public final int port;

    public UsbDeviceDescription(int vendorId, int productId, String deviceName, int port) {
        this.vendorId = vendorId;
        this.productId = productId;
        this.deviceName = deviceName;
        this.port = port;
    }

    public String getFormattedId() {
        return String.format("VID: 0x%04X, PID: 0x%04X, Port: %d", vendorId, productId, port);
    }
}
