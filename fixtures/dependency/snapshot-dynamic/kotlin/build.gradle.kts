
plugins {
    java
}

repositories {
    maven { url = uri(System.getProperty("org.nixos.gradle2nix.m2")) }
}

dependencies {
    "implementation"("org.apache:test-SNAPSHOT1:2.0.2-SNAPSHOT")
}
