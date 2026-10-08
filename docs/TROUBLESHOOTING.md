# Troubleshooting Guide

## "No USB Devices Found"
1. Verify the OTG adapter supports Host mode.
2. Check Android Settings -> Connected Devices / OTG Power.
3. Test device with another Android handset.

## "Permission Denied"
- Ensure USB permission dialog is accepted.
- Check `Constants.INTENT_ACTION_GRANT_USB` intent filter handling.

## "No Driver"
- The device VID/PID is not in the default probe table.
- Register custom VID/PID in `CustomProber.java`.
