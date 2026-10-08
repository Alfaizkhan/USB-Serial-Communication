package com.alfaizkhan.usbserialcommunication;

public final class PayloadValidator {
    private PayloadValidator() {}

    public static boolean validateFramed(byte[] payload, byte startMarker, byte endMarker) {
        if (payload == null || payload.length < 2) return false;
        return payload[0] == startMarker && payload[payload.length - 1] == endMarker;
    }

    public static boolean isLengthValid(byte[] payload, int minLength, int maxLength) {
        if (payload == null) return false;
        return payload.length >= minLength && payload.length <= maxLength;
    }
}
