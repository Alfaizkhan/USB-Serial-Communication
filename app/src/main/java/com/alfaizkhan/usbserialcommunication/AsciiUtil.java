package com.alfaizkhan.usbserialcommunication;

public final class AsciiUtil {
    public static final byte NUL = 0x00;
    public static final byte SOH = 0x01;
    public static final byte STX = 0x02;
    public static final byte ETX = 0x03;
    public static final byte EOT = 0x04;
    public static final byte ACK = 0x06;
    public static final byte NAK = 0x15;
    public static final byte ESC = 0x1B;

    private static final String[] CONTROL_NAMES = {
        "NUL", "SOH", "STX", "ETX", "EOT", "ENQ", "ACK", "BEL",
        "BS",  "HT",  "LF",  "VT",  "FF",  "CR",  "SO",  "SI",
        "DLE", "DC1", "DC2", "DC3", "DC4", "NAK", "SYN", "ETB",
        "CAN", "EM",  "SUB", "ESC", "FS",  "GS",  "RS",  "US"
    };

    private AsciiUtil() {}

    public static String getControlName(int b) {
        if (b >= 0 && b < CONTROL_NAMES.length) {
            return CONTROL_NAMES[b];
        }
        if (b == 0x7F) return "DEL";
        return null;
    }

    public static boolean isPrintable(int b) {
        return b >= 32 && b <= 126;
    }
}
