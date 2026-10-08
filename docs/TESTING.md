# Testing Strategy

## Unit Tests
- Execute fast JUnit tests on host JVM: `./gradlew test`.
- Cover data conversion algorithms (`TextUtil`), protocol decoders, and CRC checks.

## Static Analysis
- Run Android Lint: `./gradlew lint`.
- Validates XML layout inflation, manifest declarations, and API deprecations.
