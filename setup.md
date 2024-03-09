# setup
Notes for setting up a development environment for Kotlin Multiplatform

## Apple

### Xcode

Download the [xcodes](https://github.com/XcodesOrg/xcodes) utility for managing Xcode versions

    brew install xcodesorg/made/xcodes

Install Xcode 14.3.1. [The AIR SDK does not currently support Xcode 15](https://github.com/airsdk/Adobe-Runtime-Support/issues/2838)
 
    xcodes install 14.3.1

Ensure the Xcode command line tools are installed

    xcode-select --install

Check for updates to the command line tools in the software update settings (Settings > General > Software Update)

Ensure the command line tools are linked with Xcode (Settings > )

Install the relevant platform packages (Settings > Platform)

Restart IntelliJ

## Android

### Android Studio

Download and Android Studio (recommended to use JetBrains Toolbox)

Open Android Studio to perform additional installation steps (e.g. Android emulator, Android SDK)

Set the `sdk.dir` value in the project root's `local.properties` file

    sdk.dir=/Users/zachary/Library/Android/sdk
