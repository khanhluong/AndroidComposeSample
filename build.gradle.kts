// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    val compose_version = "1.0.0"

//    extra.apply {
//        set("compose_version", 1.0)
//    }
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.0.0")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}