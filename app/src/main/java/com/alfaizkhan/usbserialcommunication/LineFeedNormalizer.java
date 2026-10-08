package com.alfaizkhan.usbserialcommunication;

public final class LineFeedNormalizer {
    private LineFeedNormalizer() {}

    public static String normalizeToLf(String input) {
        if (input == null) return "";
        return input.replace("\r\n", "\n").replace("\r", "\n");
    }
}
