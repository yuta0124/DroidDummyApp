package com.example.droid2024app.primitive

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidComposePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.plugin.compose")
            }
            android {
                buildFeatures.compose = true
            }
            composeCompiler {
                enableStrongSkippingMode.set(true)
            }
            dependencies {
                implementation(platform(libs.library("composeBom")))
                implementation(libs.library("androidxCoreKtx"))
                implementation(libs.library("androidxActivityCompose"))
                implementation(libs.library("androidxLifecycleRuntimeKtx"))
                implementation(libs.library("composeUi"))
                implementation(libs.library("hiltNavigationComposePlugin"))
                // TODO: rin
//                implementation(libs.library("rin"))
                implementation(libs.library("composeMaterial3"))
                implementation(libs.library("composeUiToolingPreview"))
                implementation(libs.library("androidxLifecycleRuntimeKtx"))
                implementation(libs.library("androidxActivityCompose"))
                testImplementation(libs.library("junit"))
                testImplementation(libs.library("androidxJunit"))
                testImplementation(libs.library("androidxEspressoCore"))
                testImplementation(libs.library("composeUiTestJunit4"))
                debugImplementation(libs.library("composeUiTooling"))
                debugImplementation(libs.library("composeUiTestManifest"))
            }
        }
    }
}