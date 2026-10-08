package com.alfaizkhan.usbserialcommunication;

public final class ControlLineState {
    public final boolean rts;
    public final boolean cts;
    public final boolean dtr;
    public final boolean dsr;
    public final boolean cd;
    public final boolean ri;

    public ControlLineState(boolean rts, boolean cts, boolean dtr, boolean dsr, boolean cd, boolean ri) {
        this.rts = rts;
        this.cts = cts;
        this.dtr = dtr;
        this.dsr = dsr;
        this.cd = cd;
        this.ri = ri;
    }

    @Override
    public String toString() {
        return String.format("ControlLineState[RTS=%b, CTS=%b, DTR=%b, DSR=%b, CD=%b, RI=%b]",
                rts, cts, dtr, dsr, cd, ri);
    }
}
