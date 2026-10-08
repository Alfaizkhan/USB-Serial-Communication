# Contributing to USBSerialCommunication

Thank you for your interest in improving USBSerialCommunication!

## Development Workflow
1. Fork and clone the repository.
2. Create a feature branch from `main`: `git checkout -b feature/my-feature`.
3. Adhere to Google Java Style guidelines (4-space indentation, UTF-8).
4. Verify build and static analysis: `./gradlew assembleDebug lint`.
5. Submit a descriptive Pull Request targeting `main`.

## Code Quality Standards
- Preserve backwards compatibility with Android API 21+ (Lollipop).
- Ensure all resources and threads are safely closed upon disconnection.
- Avoid performing USB I/O on the Android Main thread.
