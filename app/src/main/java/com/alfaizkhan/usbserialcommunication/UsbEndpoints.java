package com.alfaizkhan.usbserialcommunication;

import android.hardware.usb.UsbConstants;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;

public final class UsbEndpoints {
    private UsbEndpoints() {}

    public static UsbEndpoint findBulkIn(UsbInterface iface) {
        for (int i = 0; i < iface.getEndpointCount(); i++) {
            UsbEndpoint ep = iface.getEndpoint(i);
            if (ep.getType() == UsbConstants.USB_ENDPOINT_XFER_BULK
                    && ep.getDirection() == UsbConstants.USB_DIR_IN) {
                return ep;
            }
        }
        return null;
    }

    public static UsbEndpoint findBulkOut(UsbInterface iface) {
        for (int i = 0; i < iface.getEndpointCount(); i++) {
            UsbEndpoint ep = iface.getEndpoint(i);
            if (ep.getType() == UsbConstants.USB_ENDPOINT_XFER_BULK
                    && ep.getDirection() == UsbConstants.USB_DIR_OUT) {
                return ep;
            }
        }
        return null;
    }
}
