plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "money-manager"
include("app")
include("gui-api")
include(":transaction-type:api")
include(":transaction-type:service")