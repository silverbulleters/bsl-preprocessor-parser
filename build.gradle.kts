plugins {
    `java-library`
    antlr
}

group = "org.silverbulleters"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.9.3")
    implementation("org.jetbrains:annotations:23.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks {
    compileTestJava {
        sourceCompatibility = JavaVersion.VERSION_17.toString()
        targetCompatibility = JavaVersion.VERSION_17.toString()
    }
}

tasks.withType<Jar>() {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    manifest {
        attributes("Automatic-Module-Name" to "org.silverbulleters.preprccessor.parser")
    }
}

tasks.generateGrammarSource {
    arguments = listOf(
        "-package",
        "org.silverbulleters.preprocessor.parser",
        "-encoding",
        "utf8"
    )
    outputDirectory = file("src/main/gen/org/silverbulleters/preprocessor/parser")
}

sourceSets {
    main {
        java.srcDirs("src/main/java", "src/main/gen")
        resources.srcDirs("src/main/resources")
    }
    test {
        java.srcDirs("src/test/java")
        resources.srcDirs("src/test/resources")
    }
}

// [bug] https://youtrack.jetbrains.com/issue/KT-46165
tasks.processTestResources {
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}