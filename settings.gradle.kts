pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SampleMultiModularProject"
include(":app")
include(":feature:profile")
include(":repository:profile")
include(":navigation")
include(":model:profile")
include(":domain:profile")
include(":feature:privacy")
include(":model:privacy")
include(":repository:privacy")
include(":domain:privacy")
include(":dynamicfeature")
