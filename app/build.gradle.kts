plugins {
    id("com.android.application")
    id("kotlin-android")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.3")

    defaultConfig {
        applicationId = "by.anegin.myapplication"

        minSdkVersion(21)
        targetSdkVersion(30)

        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.10")

    implementation("androidx.core:core-ktx:1.6.0-beta02")
    implementation("androidx.appcompat:appcompat:1.4.0-alpha02")

    implementation("com.google.android.material:material:1.4.0-rc01")

    implementation("androidx.navigation:navigation-fragment-ktx:${rootProject.extra.get("navigationVersion")}")
}