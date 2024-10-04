plugins {
    id("com.legion.moneymanager.java-application-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("org.postgresql:postgresql")
    runtimeOnly(project(":gui-api"))
    runtimeOnly(project(":data-access:transaction-type"))
}

application {
    mainClass.set("com.legion.moneymanager.app.App")
}
