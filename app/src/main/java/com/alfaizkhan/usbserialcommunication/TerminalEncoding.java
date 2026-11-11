package com.alfaizkhan.usbserialcommunication;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public enum TerminalEncoding {
    UTF_8("UTF-8", StandardCharsets.UTF_8),
    US_ASCII("US-ASCII", StandardCharsets.US_ASCII),
    ISO_8859_1("ISO-8859-1", StandardCharsets.ISO_8859_1);

    private final String label;
    private final Charset charset;

    TerminalEncoding(String label, Charset charset) {
        this.label = label;
        this.charset = charset;
    }

    public String getLabel() { return label; }
    public Charset getCharset() { return charset; }
}
