<<<<<<< HEAD
import java.net.URI

=======
>>>>>>> d02830de3ea95d1cb31e4b8604577ddf320bef1c
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

<<<<<<< HEAD

=======
>>>>>>> d02830de3ea95d1cb31e4b8604577ddf320bef1c
android {
    namespace = "com.bangkit.evomo"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.bangkit.evomo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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
    buildFeatures {
        mlModelBinding = true
        viewBinding = true
    }
<<<<<<< HEAD
//    allprojects {
//        repositories {
//            maven {
//                name = "ossrh-snapshot"
//                url = URI ("https://oss.sonatype.org/content/repositories/snapshots")
//            }
//        }
//    }


=======
>>>>>>> d02830de3ea95d1cb31e4b8604577ddf320bef1c
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")
<<<<<<< HEAD
//    implementation("org.tensorflow:tensorflow-lite-support:0.1.0")
//    implementation("org.tensorflow:tensorflow-lite-metadata:0.1.0")
=======
    implementation("org.tensorflow:tensorflow-lite-support:0.1.0")
    implementation("org.tensorflow:tensorflow-lite-metadata:0.1.0")
>>>>>>> d02830de3ea95d1cb31e4b8604577ddf320bef1c
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // tensorflow
<<<<<<< HEAD
    implementation("org.tensorflow:tensorflow-lite-support:0.3.0")
    implementation("org.tensorflow:tensorflow-lite-metadata:0.3.0")
    implementation ("org.tensorflow:tensorflow-lite:latest_version")
//    implementation ("org.tensorflow:tensorflow-lite:1.12.0")
//    implementation ("org.tensorflow:tensorflow-lite-select-tf-ops:0.0.0-nightly-SNAPSHOT")

    implementation ("org.tensorflow:tensorflow-lite:0.0.0-nightly-SNAPSHOT")
    // This dependency adds the necessary TF op support.
    implementation ("org.tensorflow:tensorflow-lite-select-tf-ops:0.0.0-nightly-SNAPSHOT")
=======
    implementation("org.tensorflow:tensorflow-lite-support:0.1.0")
    implementation("org.tensorflow:tensorflow-lite-metadata:0.1.0")
>>>>>>> d02830de3ea95d1cb31e4b8604577ddf320bef1c

    // OpenCV
    implementation("com.quickbirdstudios:opencv:3.4.15")

    //
}