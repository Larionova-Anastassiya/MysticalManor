plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "com.mysticalmanor"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
}

application {
    mainClass.set("MainKt")
}

