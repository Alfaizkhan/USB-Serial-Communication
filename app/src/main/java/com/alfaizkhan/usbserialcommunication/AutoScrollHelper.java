package com.alfaizkhan.usbserialcommunication;

public class AutoScrollHelper {
    private boolean autoScrollEnabled = true;

    public boolean isAutoScrollEnabled() {
        return autoScrollEnabled;
    }

    public void setAutoScrollEnabled(boolean enabled) {
        this.autoScrollEnabled = enabled;
    }

    public boolean shouldScroll(int scrollY, int maxScrollY, int threshold) {
        if (!autoScrollEnabled) return false;
        return (maxScrollY - scrollY) <= threshold;
    }
}
