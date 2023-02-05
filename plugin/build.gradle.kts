plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
    id("java-gradle-plugin")
}

dependencies {
    implementation(libs.gradle.android)
    implementation(libs.gradle.kotlin)
    implementation(libs.asm.commons)
    implementation(libs.asm.tree)
    testImplementation(libs.junit)
}