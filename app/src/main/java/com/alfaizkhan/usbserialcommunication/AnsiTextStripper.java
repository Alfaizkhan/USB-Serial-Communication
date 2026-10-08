package com.alfaizkhan.usbserialcommunication;

public final class AnsiTextStripper {
    private AnsiTextStripper() {}

    public static String strip(CharSequence cs) {
        if (cs == null) return "";
        StringBuilder sb = new StringBuilder(cs.length());
        boolean inEscape = false;

        for (int i = 0; i < cs.length(); i++) {
            char c = cs.charAt(i);
            if (c == 0x1B) {
                inEscape = true;
            } else if (inEscape) {
                if (Character.isLetter(c) || c == 'm' || c == 'K') {
                    inEscape = false;
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
