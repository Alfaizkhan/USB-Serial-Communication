# Debugging USB Connections

## Useful Logcat Filters
```bash
adb logcat -s UsbService UsbHostManager SerialSocket
```

## Inspecting Connected USB Devices
```bash
adb shell dumpsys usb
```
