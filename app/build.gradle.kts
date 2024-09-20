plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.dagger.hilt.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.kanyideveloper.muviz"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.kanyideveloper.muviz"
        minSdk = 24
        //noinspection EditedTargetSdkVersion
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.1"
//    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}



composeCompiler {
    enableStrongSkippingMode = true
}


dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.dagger.hilt.core)

    implementation(libs.kotlinx.datetime)
    implementation(libs.javax.inject)
    implementation(libs.androidx.paging.common)

    implementation(libs.kotlinx.serialization.json)

    implementation(libs.androidx.datastore.preferences)
    implementation(platform(libs.androidx.compose.bom))
    api(libs.accompanist.placeholder.material)
    api(libs.coil.compose)

    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.material3)
    debugApi(libs.androidx.compose.ui.tooling)
    debugApi(libs.androidx.compose.ui.test.manifest)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

    implementation(libs.okhttp)
    implementation(libs.retrofit)
    implementation(libs.retrofit2ConverterGson)
    implementation(libs.retrofit.kotlinx.serialization.converter)

    implementation(libs.androidx.annotation)


    implementation(libs.roomRuntime)
    ksp(libs.roomCompiler)
    implementation(libs.roomKtx)
    implementation(libs.roomPagingKtx)


    implementation(libs.accompanist.pager.indicators)
    implementation(libs.androidx.paging.compose)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.profileinstaller)
    implementation(libs.accompanist.systemuicontroller)

    implementation(libs.androidx.navigation.compose)
    implementation(libs.dagger.hilt.android)
    implementation(libs.androidx.hilt.navigation.compose)
    kapt(libs.dagger.hilt.compiler)

    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
}