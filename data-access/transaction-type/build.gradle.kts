plugins {
    id("com.legion.moneymanager.java-jpa-repository-conventions")
}
dependencies {
    implementation(project(":data-access:common"))
    implementation(project(":transaction-type:api"))
}