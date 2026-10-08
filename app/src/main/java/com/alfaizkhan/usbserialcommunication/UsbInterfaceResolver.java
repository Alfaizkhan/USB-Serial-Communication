package com.alfaizkhan.usbserialcommunication;

import android.hardware.usb.UsbConstants;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;

public final class UsbInterfaceResolver {
    private UsbInterfaceResolver() {}

    public static UsbInterface findDataInterface(UsbDevice device) {
        if (device == null) return null;
        for (int i = 0; i < device.getInterfaceCount(); i++) {
            UsbInterface iface = device.getInterface(i);
            if (iface.getInterfaceClass() == UsbConstants.USB_CLASS_CDC_DATA) {
                return iface;
            }
        }
        return device.getInterfaceCount() > 0 ? device.getInterface(0) : null;
    }
}
