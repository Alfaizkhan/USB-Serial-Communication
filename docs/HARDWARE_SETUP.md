# Hardware Setup Guide

## Requirements
1. **USB Host (OTG) Supported Android Device**: Must support USB Host mode (Android 5.0+ / API 21+).
2. **OTG Cable / Adapter**: Type-C to USB-A Female or Micro-USB OTG cable.
3. **USB-to-Serial Converter**: Based on FTDI, Silicon Labs, Prolific, WCH CH340, or USB CDC microcontroller.

## Voltage Levels & Warning
- **Logic Level UART (TTL)**: Microcontrollers (Arduino, ESP32, STM32) expect 3.3V or 5V logic.
- **RS-232 Levels**: True RS-232 ports operate at ±12V. Connecting ±12V directly to 3.3V/5V logic pins will damage the converter!
