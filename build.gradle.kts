plugins {
    `java-library`
}

version = "0.1"

tasks.compileJava {
    // Attempt to set module version as described at
    // https://docs.gradle.org/9.0.0/userguide/java_library_plugin.html#declaring_module_versions
    options.javaModuleVersion = provider { version as String }
}
