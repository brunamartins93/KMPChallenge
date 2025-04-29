package com.course.challenge

expect class Platform() {
    val osName: String
    val osVersion: String
    val deviceName: String
}