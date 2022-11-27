plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.8.0-Beta"
    antlr
}

group = "org.plang"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor", "-long-messages", "-package", "org.plang")
    copy {
        from("${buildDir}/generated-src/antlr/main")
        into("src/main/java/org/plang")
    }
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    testImplementation(kotlin("test"))
    antlr("org.antlr:antlr4:4.11.1")
    implementation("org.antlr:antlr4-runtime:4.11.1")
    implementation(kotlin("stdlib-jdk8"))

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)
}

tasks.withType<Jar>() {
    manifest {
        attributes["Main-Class"] = "org.plang.MainKt"
    }
}
