plugins {
    val kotlinVersion = "1.9.22"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.16.0"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("maven-publish")
}

mirai {
    coreVersion = "2.16.0"
}

group = "org.example"
version = "0.1.0"

repositories {
    mavenLocal()
    mavenCentral()
}