rootProject.name = "FastAsyncWorldEdit"

include("worldedit-libs")

listOf("bukkit", "core").forEach {
    include("worldedit-libs:$it")
    include("worldedit-$it")
}
// include("worldedit-mod")
include("worldedit-libs:core:ap")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven {
            name = "EngineHub"
            url = uri("https://maven.enginehub.org/repo/")
            content {
                includeGroupByRegex("com.sk89q.*")
            }
        }
    }
}
