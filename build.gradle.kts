plugins {
    kotlin("jvm") version "1.8.21"
    application
    kotlin("plugin.spring") version "1.8.21"
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management") version "1.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.linecorp.armeria:armeria-spring-boot3-starter:1.25.0")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.0")
}

application {
    mainClass.set("com.example.Main")
}

tasks.test {
    testLogging {
        showStandardStreams = true
    }
    useJUnitPlatform() // JUnit 5 플랫폼 사용 명시
}

sourceSets {
    test {
        kotlin.srcDirs("src/test/kotlin")
    }
}

kotlin {
    jvmToolchain(17) // JVM 17을 사용하도록 설정
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17" // Kotlin 컴파일러의 JVM 타겟을 17로 설정
    }
}