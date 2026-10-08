package com.alfaizkhan.usbserialcommunication;

import android.hardware.usb.UsbDeviceConnection;
import java.io.Closeable;

public final class SerialPortCloser {
    private SerialPortCloser() {}

    public static void closeSilently(UsbDeviceConnection conn, Closeable port) {
        if (port != null) {
            try {
                port.close();
            } catch (Exception ignored) {}
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception ignored) {}
        }
    }
}
