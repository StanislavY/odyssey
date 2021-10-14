plugins {
    id("multiplatform-compose-setup")
    id("android-setup")
}

kotlin {
    sourceSets {
        named("commonMain") {
            dependencies {
                api(compose.materialIconsExtended)
                implementation(project(":odyssey:odyssey-compose"))
                implementation(project(":odyssey:odyssey-core"))
            }
        }

        named("androidMain") {
            dependencies {
                implementation(Dependencies.AndroidX.AppCompat.fragmentKtx)
            }
        }
    }
}