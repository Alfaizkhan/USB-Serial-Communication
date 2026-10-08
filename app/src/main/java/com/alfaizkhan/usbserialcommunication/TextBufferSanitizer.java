package com.alfaizkhan.usbserialcommunication;

public final class TextBufferSanitizer {
    private TextBufferSanitizer() {}

    public static CharSequence trimToSize(CharSequence text, int maxLength) {
        if (text == null || text.length() <= maxLength) return text;
        return text.subSequence(text.length() - maxLength, text.length());
    }
}
