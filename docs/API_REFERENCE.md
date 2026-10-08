# API Reference

## SerialService
- `connect(SerialSocket socket)`: Initiates socket connection and foreground state.
- `disconnect()`: Closes connection and cleans up notifications.
- `write(byte[] data)`: Queues bytes for transmission to USB serial port.
- `attach(SerialListener listener)`: Connects UI fragment listener.
- `detach()`: Detaches UI listener and starts background notification buffering.
