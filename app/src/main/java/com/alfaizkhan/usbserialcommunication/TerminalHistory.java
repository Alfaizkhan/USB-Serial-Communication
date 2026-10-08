package com.alfaizkhan.usbserialcommunication;

import java.util.ArrayList;
import java.util.List;

public class TerminalHistory {
    private final int maxEntries;
    private final List<String> history = new ArrayList<>();
    private int cursor = -1;

    public TerminalHistory(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public synchronized void addCommand(String command) {
        if (command == null || command.trim().isEmpty()) return;
        if (!history.isEmpty() && history.get(history.size() - 1).equals(command)) return;
        if (history.size() >= maxEntries) {
            history.remove(0);
        }
        history.add(command);
        cursor = history.size();
    }

    public synchronized String getPrevious() {
        if (history.isEmpty()) return null;
        if (cursor > 0) {
            cursor--;
        }
        return history.get(cursor);
    }
}
