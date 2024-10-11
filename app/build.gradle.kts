plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.easyfood"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.easyfood"
        minSdk = 21
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

    buildFeatures{
        viewBinding=true
    }
}

dependencies {
    val nav_version = "2.8.2" // Correct declaration for Kotlin

    implementation("androidx.legacy:legacy-support-v4:1.0.0") // Use double quotes

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // navigation component
    implementation("androidx.navigation:navigation-fragment:$nav_version")
    implementation("androidx.navigation:navigation-ui:$nav_version")

    // intuit
    implementation("com.intuit.sdp:sdp-android:1.0.6") // Use double quotes
    implementation("com.intuit.ssp:ssp-android:1.0.6") // Use double quotes

    // gif
    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.17") // Use double quotes

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    //this convert the json into kotlin
    implementation ("com.squareup.retrofit2:converter-gson:2.3.0")

    //get the images from the internet
    implementation ("com.github.bumptech.glide:glide:4.12.0")
}
