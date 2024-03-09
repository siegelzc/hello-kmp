import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("module.publication")
}

repositories {
    google()
    mavenCentral()
    maven { url = uri("https://codeberg.org/api/packages/Kenta/maven") } // KaylibKit
}

kotlin {
    @OptIn(ExperimentalKotlinGradlePluginApi::class)
    targetHierarchy.default()

    jvm()
    androidTarget {
        publishLibraryVariants("release")
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    macosArm64()
    macosX64()
    linuxX64()
    mingwX64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain {
            dependencies {

            }
        }
        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }

        val macosArm64Main by getting {
            dependencies {
                implementation("com.prism-architect:KaylibKit-macosarm64:1.0.5")
            }
        }

        val macosX64Main by getting {
            dependencies {
                implementation("com.prism-architect:KaylibKit-macosx64:1.0.5")
            }
        }

        val linuxX64Main by getting {
            dependencies {
                implementation("com.prism-architect:KaylibKit-linuxx64:1.0.5")
            }
        }

        val mingwX64Main by getting {
            dependencies {
                implementation("com.prism-architect:KaylibKit-mingwx64:1.0.5")
            }
        }
    }
}

android {
    namespace = "org.jetbrains.kotlinx.multiplatform.library.template"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}
