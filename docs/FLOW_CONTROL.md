# UART Flow Control Guide

Flow control prevents buffer overflows when the receiver cannot process data as fast as the transmitter sends it.

## Hardware Flow Control
- **RTS/CTS (Request to Send / Clear to Send)**:
  - RTS is driven low/high by receiver to pause incoming bytes.
  - CTS is monitored by transmitter before pushing bytes.
- **DTR/DSR (Data Terminal Ready / Data Set Ready)**:
  - Used for modem handshaking and session establishment.

## Software Flow Control
- **XON/XOFF**:
  - Uses ASCII control characters: DC1 (0x11, XON) to resume and DC3 (0x13, XOFF) to pause.
  - Filtered by `XonXoffFilter` in `usb-serial-for-android`.
