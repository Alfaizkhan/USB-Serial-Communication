package com.alfaizkhan.usbserialcommunication;

public final class HexViewerOptions {
    public final int bytesPerLine;
    public final boolean showAsciiSidebar;
    public final boolean uppercase;

    public HexViewerOptions(int bytesPerLine, boolean showAsciiSidebar, boolean uppercase) {
        this.bytesPerLine = bytesPerLine;
        this.showAsciiSidebar = showAsciiSidebar;
        this.uppercase = uppercase;
    }

    public static HexViewerOptions standard() {
        return new HexViewerOptions(16, true, true);
    }
}
