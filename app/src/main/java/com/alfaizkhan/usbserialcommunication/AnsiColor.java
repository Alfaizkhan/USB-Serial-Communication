package com.alfaizkhan.usbserialcommunication;

public enum AnsiColor {
    BLACK(30, 0xFF000000),
    RED(31, 0xFFCC0000),
    GREEN(32, 0xFF00CC00),
    YELLOW(33, 0xFFCCCC00),
    BLUE(34, 0xFF0000CC),
    MAGENTA(35, 0xFFCC00CC),
    CYAN(36, 0xFF00CCCC),
    WHITE(37, 0xFFCCCCCC);

    private final int code;
    private final int argb;

    AnsiColor(int code, int argb) {
        this.code = code;
        this.argb = argb;
    }

    public int getCode() { return code; }
    public int getArgb() { return argb; }
}
