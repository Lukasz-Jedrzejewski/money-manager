plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "money-manager"
include("app")
include("gui-api")
include("common:generic-service-api")
include("data-access:common")
include("data-access:transaction-type")