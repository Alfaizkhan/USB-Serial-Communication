# Buffer Management & UI Throttling

Serial streams can deliver hundreds of chunks per second.

## Strategy
1. Background thread queues incoming byte chunks into `ArrayDeque<byte[]>`.
2. Main thread is notified only once when queue transitions from empty to non-empty.
3. UI updates batch append received text, capping screen updates to 60fps.
