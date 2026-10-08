package com.alfaizkhan.usbserialcommunication;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class CircularLineBuffer {
    private final int maxLines;
    private final ArrayDeque<String> lines;

    public CircularLineBuffer(int maxLines) {
        this.maxLines = maxLines;
        this.lines = new ArrayDeque<>(maxLines);
    }

    public synchronized void addLine(String line) {
        if (lines.size() >= maxLines) {
            lines.pollFirst();
        }
        lines.addLast(line);
    }

    public synchronized List<String> getLines() {
        return new ArrayList<>(lines);
    }

    public synchronized void clear() {
        lines.clear();
    }
}
