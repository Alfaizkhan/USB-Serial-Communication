package com.alfaizkhan.usbserialcommunication;

public class PortStateTracker {
    private volatile boolean open = false;
    private volatile String lastError = null;

    public void setOpen(boolean open) {
        this.open = open;
        if (open) lastError = null;
    }

    public boolean isOpen() {
        return open;
    }

    public void setError(String error) {
        this.lastError = error;
        this.open = false;
    }

    public String getLastError() {
        return lastError;
    }
}
