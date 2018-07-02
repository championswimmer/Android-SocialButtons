# Android SocialButtons
An android library for implementing login/share buttons easily for social networks.

As of now, this is **only** a UI library. This library does not provide any social network
functionality. That you have to code yourself. 

[![Paypal Donate](https://img.shields.io/badge/Donate-Paypal-2244dd.svg)](https://paypal.me/championswimmer)


[![Build Status](https://travis-ci.org/championswimmer/Android-SocialButtons.svg)](https://travis-ci.org/championswimmer/Android-SocialButtons)
[![Release](https://img.shields.io/github/tag/championswimmer/Android-SocialButtons.svg?label=maven)](https://jitpack.io/#championswimmer/Android-SocialButtons)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20SocialButtons-orange.svg?style=plastic)](http://android-arsenal.com/details/1/2740)


## Screenshots
<img src="/screenshots/screen1.png" width="300"/>
<img src="/screenshots/screen2.png" width="300"/>
<img src="/screenshots/screen3.png" width="300"/>


## How to use

### Include the library
You can either download the source or add to gradle via [jitpack.io](http://jitpack.io)
Add jitpack to your dependencies (in the main project folder) - 
```groovy
 repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
```

And include the library in your dependencies (in app folder)   
```groovy
 dependencies {
        compile 'in.championswimmer:Android-SocialButtons:1.3'
    }
```  

### Floating Action Buttons
#### Usage
To use FloatingActionButtons, (for example a Facebook button), use the `FABFacebook` component

```xml
        <in.championswimmer.libsocialbuttons.fabs.FABSocial
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="7dp"
            app:social="facebook"
             />

```

#### Customizations
Other than the color and the icon, everything else can be changed using the usual xml attributes. `android:src`, `android:backgroundTint` will have no effect even if you set them in your layout xml. 

### Buttons
#### Usage
Usual `Button` is also available. To use, for example a Twitter button, use the following in your xml   
```xml
    <in.championswimmer.libsocialbuttons.buttons.BtnSocial
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:text="Follow on Twitter"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:social="twitter"
         />
```

#### Customizations
You have to set your own text using the `android:text` attribute. While the Button has it's own style predefined, you can still override the following via xml attributes - 
* `android:textAllCaps` (Default: false)
* `android:font-family` and `android:textStyle` (Default: sans-serif-ligt normal)
* `android:textSize` (Default: 24sp)
* `android:padding` (Default: 15dp)
* `android:drawablePadding` (Default: 15dp)

You cannot set `android:drawableLeft` and the other Right, Top, Bottom drawbles.

**NOTE: If you chose to you can set no text, and you'll just get a square button with a social icon in it**


### Credits 
* [DesignPieces collection of social colors](http://designpieces.com/2012/12/social-media-colours-hex-and-rgb/)

## License 
This software is licensed under the Apache License V2.0
A copy can be found [here](./LICENSE.md)
