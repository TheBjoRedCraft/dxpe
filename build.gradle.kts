plugins {
    kotlin("jvm") version "2.4.20"
    id("de.eldoria.plugin-yml.paper") version "0.9.0"
}

group = "dev.thebjoredcraft"
version = findProperty("version") as String

repositories {
    mavenCentral()
    maven(url = "https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:26.3.build.+")
}

paper {
    main = "dev.thebjoredcraft.dxpe.DxpeMain"
    apiVersion = "1.21.11"

    foliaSupported = true
    authors = listOf("TheBjoRedCraft")
}


kotlin {
    jvmToolchain(25)
}