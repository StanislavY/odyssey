import org.apache.tools.ant.util.JavaEnvUtils.VERSION_1_8

plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
}

android {
    compileSdkVersion(31)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = org.gradle.api.JavaVersion.VERSION_1_8
        targetCompatibility = org.gradle.api.JavaVersion.VERSION_1_8
    }

    packagingOptions {
        exclude("META-INF/*")
    }
}

dependencies {
    implementation(project(":common:common-root"))
    implementation(project(":odyssey:odyssey-compose"))
    implementation(project(":odyssey:odyssey-core"))
    implementation(project(":common:common-compose"))
    implementation(compose.material)

    implementation(Dependencies.AndroidX.AppCompat.appCompat)
    implementation(Dependencies.AndroidX.Activity.activityCompose)
    implementation(Dependencies.Images.kamel)
    implementation("io.github.alexgladkov:odyssey-core:0.2.0") // For core classes
    implementation("io.github.alexgladkov:odyssey-compose:0.2.0") // For compose extensions


}