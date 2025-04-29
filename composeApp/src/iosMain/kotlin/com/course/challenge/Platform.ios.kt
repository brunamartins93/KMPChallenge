package com.course.challenge

import platform.UIKit.UIDevice

actual class Platform {
    actual val osName: String
        get() = UIDevice.currentDevice.systemName
    actual val osVersion: String
        get() = UIDevice.currentDevice.systemVersion
    actual val deviceName: String
        get() = UIDevice.currentDevice.model
}