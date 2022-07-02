plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    `java-gradle-plugin`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

object PluginVersions {
    const val gradle_plugin_version = "7.1.1"
    const val kotlin_gradle_plugin_version = "1.6.10"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginVersions.gradle_plugin_version}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersions.kotlin_gradle_plugin_version}")
}