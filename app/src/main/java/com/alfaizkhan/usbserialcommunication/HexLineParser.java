package com.alfaizkhan.usbserialcommunication;

import java.io.ByteArrayOutputStream;

public final class HexLineParser {
    private HexLineParser() {}

    public static byte[] parse(String hexLine) {
        if (hexLine == null) return new byte[0];
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String[] tokens = hexLine.trim().split("\\s+");
        for (String token : tokens) {
            if (token.isEmpty()) continue;
            try {
                int val = Integer.parseInt(token, 16);
                out.write(val & 0xFF);
            } catch (NumberFormatException ignored) {
            }
        }
        return out.toByteArray();
    }
}
