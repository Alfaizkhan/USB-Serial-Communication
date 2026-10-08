# Release Process

1. Increment `versionCode` and update `versionName` in `app/build.gradle`.
2. Run clean check: `./gradlew clean build test lint`.
3. Build unsigned release APK: `./gradlew assembleRelease`.
4. Sign with `apksigner` and align with `zipalign`.
5. Verify signature: `apksigner verify --verbose app-release.apk`.
