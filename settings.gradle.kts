pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "BaselineProfiler"
include(":app")
includeBuild("./plugin")

//enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
//enableFeaturePreview("VERSION_CATALOGS")
include(":benchmark")
