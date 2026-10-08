# Background Service Architecture

`SerialService` keeps the serial connection alive while the user navigates away or rotates the screen.

## Key Features
- **Foreground Service Type**: `connectedDevice` and `remoteMessaging`.
- **Notification Channel**: Low importance channel prevents disruptive sound while keeping persistent status icon.
- **Queueing Mechanism**: Dual queues (`queue1` for active listener delivery, `queue2` for background buffer).
