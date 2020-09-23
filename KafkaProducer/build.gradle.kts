import org.gradle.jvm.tasks.Jar

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

application{
    mainClass.set("MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.apache.kafka:kafka-streams:2.8.0")
    implementation("com.beust:klaxon:5.5")
    implementation("org.jetbrains.kotlin:kotli