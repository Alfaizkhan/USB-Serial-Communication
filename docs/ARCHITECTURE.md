# Technical Architecture

## Overview
USBSerialCommunication provides a line-oriented USB-to-UART terminal on Android utilizing the Android Open Source Project (AOSP) USB Host APIs and `usb-serial-for-android` driver engine.

## Component Layers

```
+-----------------------------------------------------------+
|                      TerminalFragment                     |
|            (UI, ANSI Terminal, Hex View, Buttons)         |
+-----------------------------+-----------------------------+
                              |
                     ServiceConnection
                              |
+-----------------------------v-----------------------------+
|                       SerialService                       |
|           (Foreground Service, Event Deque Buffering)     |
+-----------------------------+-----------------------------+
                              |
                    SerialListener Callback
                              |
+-----------------------------v-----------------------------+
|                       SerialSocket                        |
|       (UsbSerialPort Wrapper, SerialInputOutputManager)   |
+-----------------------------+-----------------------------+
                              |
               usb-serial-for-android Drivers
               (FTDI, Silabs, Prolific, CH34x, CDC)
                              |
+-----------------------------v-----------------------------+
|                     UsbDeviceConnection                   |
|                   (Android USB Host API)                  |
+-----------------------------------------------------------+
```

## Data Ingestion & Buffering
Incoming bytes are ingested via `SerialInputOutputManager` on a dedicated thread, transferred to `SerialService` using an `ArrayDeque`, and delivered to the main looper for rendering in chunks to avoid UI stutter.
