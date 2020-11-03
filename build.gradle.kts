plugins {
    java
    id("io.qameta.allure")
}

allure {
    version = "2.8.1"
    autoconfigure = true
    aspectjweaver = true
}

group = "autotests"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val testngVersion by extra("7.0.0")
val allureVersion by extra("2.13.5")

dependencies {
    implementation("io.qameta.allure", "allure-testng", allureVersion)
    implementation("io.qameta.allure", "allure-model", allureVersion)
    testImplementation("org.testng", "testng", testngVersion)
}

tasks.named<Test>("test") {
    useTestNG()
}
