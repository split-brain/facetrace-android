# How to get started with Clojure development for Android

## Required Tools
```
Java
clojure-android/clojure 1.6.0
Leiningen
lein-droid
Android SDK Tools
```

## Install Android SDK
Download and install [Android SDK](http://developer.android.com/sdk/). Run `android` and install following packages:
```
Android SDK Tools
Android Platform Tools
Android Build Tools
Android 4.0 (API 14)
```

## Setup lein-droid
If you do not already have a =~/.lein/profiles.clj= file, create it with the following content:
```clojure
{:user {:plugins [ [lein-droid "0.2.3"] ]
        :android {:sdk-path "/usr/local/opt/android-sdk"}}}
```

## Build and deployment
### Connecting Android device
If you have Android device at android it's much easier to work with it than with Android emulator, since emulator is very slow.
Before you can connect your Android device you need to enable [Developer Options](http://www.syncios.com/blog/enable-developer-optionsusb-debugging-mode-on-devices-with-android-4-2-jelly-bean/).

### Build
Build as simple as running ```lein droid doall```. This will build, package and deploy android application to a connected device or emulator.

### Interactive development
As soon as you have Android application deployed and running you can connect to it's REPL session and play with things.

To install the newly created application to the device run:

```lein droid install```

After that, to run your application execute this (of course, you
can run it from the device):

```lein droid run```

The application will start and run the REPL server by default. To
connect to it run the following command:

```lein do droid forward-port, droid repl```

The first command binds the port on the device to the port on the
computer (by default they are both 9999). You only have to run this
command once per development session (while *adb* daemon is
running). The second command connects to the nREPL server using
REPLy client.

If all goes well you'll see a REPL prompt. Then execute:

```clojure
(in-ns 'org.splitbrain.facetrace.main)
```

You can execute first three subtasks (`install`, `run`,
`forward-port`) by running `lein droid deploy`.

That's all, now you are able to execute Clojure code in a REPL on
the Android device!


## Tutorials and useful links
* [lein-droid tutorial](https://github.com/clojure-android/lein-droid/wiki/Tutorial/)
* [Android Development with Clojure](https://github.com/krisc/events/blob/master/tutorial.md)
