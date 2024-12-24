plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.example.profile"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.profile"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.2"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    // Core Compose UI library
    implementation("androidx.compose.ui:ui:1.5.0")

    // Foundation for layout components like Column and Row
    implementation("androidx.compose.foundation:foundation:1.5.0")

    // Tooling for previews and other Compose features
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.0")

    // Compose runtime for state management and other core features
    implementation("androidx.compose.runtime:runtime:1.5.0")

    // Optional: Material design components
    implementation("androidx.compose.material:material:1.5.0")

    // Optional: Compose material icons
    implementation("androidx.compose.material:material-icons-core:1.5.0")
    implementation("androidx.compose.material:material-icons-extended:1.5.0")


    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.runtime:runtime:1.5.2")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")

    // Hilt core dependency
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")

    // Optional - for Jetpack ViewModel support
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.1.0-alpha01")
    kapt("androidx.hilt:hilt-compiler:1.1.0-alpha01")

    implementation(project(":domain:profile"))
    implementation(project(":model:profile"))

}