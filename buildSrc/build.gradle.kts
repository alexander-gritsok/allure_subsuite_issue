plugins {
    java
}

group = "autotests"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    runtimeClasspath("io.qameta.allure:allure-gradle:2.8.1")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}