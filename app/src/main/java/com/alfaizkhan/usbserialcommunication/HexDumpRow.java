package com.alfaizkhan.usbserialcommunication;

public final class HexDumpRow {
    public final int offset;
    public final String hexBytes;
    public final String asciiCharacters;

    public HexDumpRow(int offset, String hexBytes, String asciiCharacters) {
        this.offset = offset;
        this.hexBytes = hexBytes;
        this.asciiCharacters = asciiCharacters;
    }
}
