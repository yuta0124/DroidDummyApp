import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.example.droid2024app.buildlogic"

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "17"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(libs.bundles.plugins)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "droid2024app.primitive.androidapplication"
            implementationClass = "com.example.droid2024app.primitive.AndroidApplicationPlugin"
        }
        register("android") {
            id = "droid2024app.primitive.android"
            implementationClass = "com.example.droid2024app.primitive.AndroidPlugin"
        }
        register("androidKotlin") {
            id = "droid2024app.primitive.android.kotlin"
            implementationClass = "com.example.droid2024app.primitive.AndroidKotlinPlugin"
        }
        register("androidCompose") {
            id = "droid2024app.primitive.android.compose"
            implementationClass = "com.example.droid2024app.primitive.AndroidComposePlugin"
        }
        register("androidHilt") {
            id = "droid2024app.primitive.android.hilt"
            implementationClass = "com.example.droid2024app.primitive.AndroidHiltPlugin"
        }
        register("androidFeature") {
            id = "droid2024app.convention.androidfeature"
            implementationClass = "com.example.droid2024app.convention.AndroidFeaturePlugin"
        }
    }
}
