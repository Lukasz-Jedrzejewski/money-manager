plugins {
    id("com.legion.moneymanager.java-rest-api-conventions")
}

dependencies {
    implementation(project(":transaction-type:api"))
}