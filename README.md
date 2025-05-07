# CMP-8126 androidx.compose.ui.window.Dialog not working in CMP 1.8.0, OS iOS

## Bug Description

I have a question regarding iOS during CMP development. The CMP version I'm using is 1.8.0, and for multiplatform-navigation, it's 2.9.0-beta01.
The problem is that when using androidx.compose.ui.window.Dialog in commonMain, the dialog no longer appears after using features like an in-app browser or the native camera.

## Versions

- Compose Multiplatform version*: 1.8.0
- Kotlin version: 2.1.20
- OS (name, version, arch): 18.3.1
- Device (model or simulator for iOS issues): iPhone 14 Pro

## Reproduction Steps
Steps and/or the code snippet to reproduce the behavior:

1. open in app browser or native camera (e.g. using rootViewController.presentViewController)
2. open dialog
3. not visible dialog

## issue
[YouTrack](https://youtrack.jetbrains.com/issue/CMP-8126/androidx.compose.ui.window.Dialog-not-working-in-CMP-1.8.0-OS-iOS)…