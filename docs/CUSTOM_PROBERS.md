# Custom Probers Guide

When using proprietary hardware with standard UART bridge chipsets, add custom VID/PID mappings:

```java
// In CustomProber.java
customTable.addProduct(0x1234, 0xabcd, FtdiSerialDriver.class);
```

Also declare the USB attachment filter in `app/src/main/res/xml/usb_device_filter.xml`:
```xml
<usb-device vendor-id="4660" product-id="43981" />
```
