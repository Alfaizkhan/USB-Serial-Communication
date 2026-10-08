package com.alfaizkhan.usbserialcommunication;

public final class UsbVendorIds {
    public static final int FTDI = 0x0403;
    public static final int SILABS = 0x10C4;
    public static final int PROLIFIC = 0x067B;
    public static final int WCH_QINHENG = 0x1A86;
    public static final int ARDUINO = 0x2341;
    public static final int RASPBERRY_PI = 0x2E8A;
    public static final int MICROCHIP_ATMEL = 0x03EB;
    public static final int STMICROELECTRONICS = 0x0483;

    private UsbVendorIds() {}

    public static String getVendorName(int vid) {
        switch (vid) {
            case FTDI: return "FTDI";
            case SILABS: return "Silicon Labs";
            case PROLIFIC: return "Prolific";
            case WCH_QINHENG: return "WCH / Qinheng";
            case ARDUINO: return "Arduino";
            case RASPBERRY_PI: return "Raspberry Pi";
            case MICROCHIP_ATMEL: return "Atmel / Microchip";
            case STMICROELECTRONICS: return "STMicroelectronics";
            default: return String.format("Vendor 0x%04X", vid);
        }
    }
}
