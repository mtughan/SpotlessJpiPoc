plugins {
    id("java")
    id("com.diffplug.spotless") version "6.25.0"
    id("org.jenkins-ci.jpi") version "0.51.0"
}

group = "com.github.mtughan"
version = "1.0-SNAPSHOT"

jenkinsPlugin {
    jenkinsVersion = "2.440.1"
    shortName = "spotless-jpi-poc"
    url = "https://github.com/mtughan/SpotlessJpiPoc"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(11)
    }
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

spotless {
    java {
        googleJavaFormat("1.23.0")
    }
}
