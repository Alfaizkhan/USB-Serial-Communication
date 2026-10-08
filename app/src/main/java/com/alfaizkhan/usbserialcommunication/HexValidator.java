package com.alfaizkhan.usbserialcommunication;

public final class HexValidator {
    private HexValidator() {}

    public static boolean isHexDigit(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    public static boolean isValidHexString(CharSequence s) {
        if (s == null || s.length() == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isHexDigit(c) && !Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }
}
