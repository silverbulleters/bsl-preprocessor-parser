plugins {
    `java-library`
    antlr
    `maven-publish`
}

group = "org.github.silverbulleters"
version = "0.1"

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
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
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

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                description.set("Parser for 1C: Enterprise preprocessor language.")
                url.set("https://github.com/silverbulleters/bsl-preprocessor-parser")
                licenses {
                    license {
                        name.set("LGPL-3.0")
                        url.set("https://www.gnu.org/licenses/lgpl-3.0.en.html")
                        distribution.set("repo")
                    }
                }
                developers {
                    developer {
                        id.set("team")
                        name.set("Team Silverbulleters")
                        email.set("team@silverbulleters.org")
                        url.set("https://github.com/silverbulleters")
                        organization.set("silverbulleters")
                        organizationUrl.set("https://github.com/silverbulleters")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/silverbulleters/bsl-preprocessor-parser.git")
                    developerConnection.set("scm:git:git@github.com:silverbulleters/bsl-preprocessor-parser.git")
                    url.set("https://github.com/silverbulleters/bsl-preprocessor-parser.git")
                }
            }
        }
    }
}