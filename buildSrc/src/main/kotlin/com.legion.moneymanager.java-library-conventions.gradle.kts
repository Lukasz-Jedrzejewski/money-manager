plugins {
    id("com.legion.moneymanager.java-common-conventions")

    `java-library`
}

dependencies {
    implementation("org.springframework:spring-tx")
    implementation("org.springframework:spring-context")
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("jakarta.annotation:jakarta.annotation-api")
    testImplementation("org.springframework:spring-test")
}