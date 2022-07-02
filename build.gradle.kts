// Top-level build file where you can add configuration options common to all sub-projects/modules.

import org.gradle.api.JavaVersion.VERSION_11

val javaVersion: JavaVersion by extra { VERSION_11 }

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}