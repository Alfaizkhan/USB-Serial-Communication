package com.alfaizkhan.usbserialcommunication;

public final class TerminalTheme {
    public static final TerminalTheme DARK = new TerminalTheme(0xFF000000, 0xFFFFFFFF, 0xFF666666);
    public static final TerminalTheme LIGHT = new TerminalTheme(0xFFFFFFFF, 0xFF000000, 0xFFAAAAAA);
    public static final TerminalTheme MATRIX = new TerminalTheme(0xFF0D1117, 0xFF00FF66, 0xFF00AA44);

    public final int backgroundColor;
    public final int textColor;
    public final int caretColor;

    public TerminalTheme(int backgroundColor, int textColor, int caretColor) {
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.caretColor = caretColor;
    }
}
