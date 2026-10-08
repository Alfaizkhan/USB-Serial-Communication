package com.alfaizkhan.usbserialcommunication;

public final class SerialFilterCriteria {
    public final int vendorId;
    public final int productId;
    public final String vendorName;

    public SerialFilterCriteria(int vendorId, int productId, String vendorName) {
        this.vendorId = vendorId;
        this.productId = productId;
        this.vendorName = vendorName;
    }

    public boolean matches(int vid, int pid) {
        boolean matchVid = (vendorId == -1 || vendorId == vid);
        boolean matchPid = (productId == -1 || productId == pid);
        return matchVid && matchPid;
    }
}
