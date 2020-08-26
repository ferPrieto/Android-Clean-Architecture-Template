plugins {
    id("com.android.library")
    id("prieto.fernando.android.plugin")
}

dependencies {
    implementation(project(ProjectModules.domain))
    implementation(project(ProjectModules.coreAndroidTest))
}