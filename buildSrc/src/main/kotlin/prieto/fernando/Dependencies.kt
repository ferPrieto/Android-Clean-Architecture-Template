object ProjectModules {
    const val core = ":core"
    const val navigation = ":navigation"
    const val data = ":data"
    const val dataRemote = ":data-remote"
    const val domain = ":domain"
    const val presentation = ":presentation"
    const val coreAndroidTest = ":core-android-test"
}

object AndroidSettings {
    const val compileSdk = 29
    const val buildTools = "29.0.2"
    const val minSdk = 26
    const val targetSdk = 29
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object Versions {
    const val appCompat = "1.1.0"
    const val navigation = "2.1.0"
    const val constraintLayout = "1.1.3"
    const val legacySupportV4 = "1.0.0"
    const val lifecycleLivedataKtx = "2.2.0-rc01"
    const val livedataTesting = "1.1.1"
    const val dagger = "2.24"
    const val androidxTest = "1.2.0"
    const val espresso = "3.2.0"
    const val androidxJunit = "1.1.1"
    const val junit = "4.12"
    const val junitPlatformRunner = "1.0.2"
    const val mockito = "2.27.0"
    const val mockitoKotlin = "1.5.0"
    const val gradle = "3.5.1"
    const val kotlin = "1.3.60"
    const val coreTesting = "1.1.1"
    const val kotlinxCoroutines = "1.3.2"
    const val hilt = "2.28-alpha"
    const val hiltViewModel = "1.0.0-alpha01"
}

object BuildDependencies {
    const val androidGradle =
        "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val hiltGradlePlugin =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
}

object Dependencies {

    object AndroidX {
        const val fragmentKtx =
            "androidx.fragment:fragment-ktx:${Versions.appCompat}"
        const val coreKtx =
            "androidx.core:core-ktx:${Versions.appCompat}"
        const val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val legacySupport =
            "androidx.legacy:legacy-support-v4:${Versions.legacySupportV4}"
        const val lifecycleLivedataKtx =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleLivedataKtx}"
        const val lifecycleCompiler =
            "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleLivedataKtx}"
        const val archViewModel =
            "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycleLivedataKtx}"
        const val archComponents =
            "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleLivedataKtx}"

        object Navigation {
            const val fragmentKtx =
                "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
            const val uiKtx =
                "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        }
    }

    const val kotlinxCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutines}"

    object Dagger {
        const val dagger =
            "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerAndroid =
            "com.google.dagger:dagger-android:${Versions.dagger}"
        const val daggerAndroidSupport =
            "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val daggerCompiler =
            "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val daggerAndroidProcessor =
            "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    }

    object Hilt {
        const val hilt =
            "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler =
            "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModel}"

    }
}

object TestDependencies {

    object AndroidX {
        const val core =
            "androidx.test:core:${Versions.androidxTest}"
        const val coreKtx =
            "androidx.test:core-ktx:${Versions.androidxTest}"
        const val runner =
            "androidx.test:runner:${Versions.androidxTest}"
        const val rules =
            "androidx.test:rules:${Versions.androidxTest}"
        const val espressoCore =
            "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val espressoContrib =
            "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
        const val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.androidxTest}"
        const val junit =
            "androidx.test.ext:junit:${Versions.androidxJunit}"
        const val coreTesting =
            "android.arch.core:core-testing:${Versions.coreTesting}"
    }

    const val kotlinxCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinxCoroutines}"

    object JUnit {
        const val junit =
            "junit:junit:${Versions.junit}"
        const val junitPlatformRunner =
            "org.junit.platform:junit-platform-runner:${Versions.junitPlatformRunner}"
    }

    const val livedataTesting =
        "com.jraska.livedata:testing-ktx:${Versions.livedataTesting}"

    object Mockito {
        const val mockitoCore =
            "org.mockito:mockito-core:${Versions.mockito}"
        const val mockitoInline =
            "org.mockito:mockito-inline:${Versions.mockito}"
        const val mockitoKotlin =
            "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlin}"
    }
}
