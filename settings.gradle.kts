pluginManagement {
    includeBuild("convention-plugins")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }

}

rootProject.name = "hello-world"
include(":library")
