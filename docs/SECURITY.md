# Security Policy

## Intent Security
- Disconnect broadcast receiver is registered with `ContextCompat.RECEIVER_NOT_EXPORTED` on Android 14+ (API 34+).
- Intent actions are namespaced with `BuildConfig.APPLICATION_ID` to prevent cross-app broadcast spoofing.

## USB Access
- USB permissions are granted per-device session via Android `UsbManager`.
