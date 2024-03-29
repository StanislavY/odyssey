object Dependencies {

    object DI {
        const val kodein = "org.kodein.di:kodein-di:7.1.0"
    }

    object Images {
        const val kamel = "com.alialbaali.kamel:kamel-image:0.3.0"
    }

    object JetBrains {
        object Kotlin {
            // __KOTLIN_COMPOSE_VERSION__
            private const val VERSION = "1.5.31"
            const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VERSION"
            const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:$VERSION"
            const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:$VERSION"
            const val testAnnotationsCommon =
                "org.jetbrains.kotlin:kotlin-test-annotations-common:$VERSION"

            const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:0.2.1"

            const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-core:1.2.2"
            const val serializationPlugin = "org.jetbrains.kotlin:kotlin-serialization:$VERSION"

            private const val coroutinesVersion = "1.5.1-native-mt"
            const val coroutines =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
            const val coroutinesCommon =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:$coroutinesVersion"
        }

        object Compose {
            // __LATEST_COMPOSE_RELEASE_VERSION__
            private const val VERSION = "1.0.0"
            const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$VERSION"
        }

        object Ktor {
            private const val ktorVersion = "1.6.2"
            const val core = "io.ktor:ktor-client-core:${ktorVersion}"
            const val json = "io.ktor:ktor-client-json:${ktorVersion}"
            const val iOS = "io.ktor:ktor-client-ios:${ktorVersion}"
            const val iOSCore = "io.ktor:ktor-client-core-native:$ktorVersion"
            const val serialization = "io.ktor:ktor-client-serialization:${ktorVersion}"
            const val logging = "io.ktor:ktor-client-logging:$ktorVersion"
            const val android = "io.ktor:ktor-client-android:$ktorVersion"
            const val okHttp = "io.ktor:ktor-client-okhttp:$ktorVersion"
        }
    }

    object Android {
        object Tools {
            object Build {
                const val gradlePlugin = "com.android.tools.build:gradle:4.1.0"
            }
        }
    }

    object AndroidX {
        object AppCompat {
            const val appCompat = "androidx.appcompat:appcompat:1.3.0-beta01"
            const val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.1"
        }

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.3.0-beta02"
        }
    }
}