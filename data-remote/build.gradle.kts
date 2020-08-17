plugins {
    id("com.android.library")
    id("prieto.fernando.android.plugin")
}

dependencies {
    implementation(project(ProjectModules.data))
    implementation(Dependencies.Dagger.daggerAndroid)

    testImplementation(project(ProjectModules.coreAndroidTest))
}