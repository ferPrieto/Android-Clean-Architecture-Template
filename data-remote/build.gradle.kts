plugins {
    id("com.android.library")
    id("prieto.fernando.android.plugin")
}

dependencies {
    implementation(project(ProjectModules.data))
    testImplementation(project(ProjectModules.coreAndroidTest))
}