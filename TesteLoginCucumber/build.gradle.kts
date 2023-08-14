plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/junit/junit
    testImplementation("junit:junit:4.12")
    // https://mvnrepository.com/artifact/info.cukes/cucumber-junit
    testImplementation("info.cukes:cucumber-junit:1.2.5")
    // https://mvnrepository.com/artifact/info.cukes/cucumber-java
    implementation("info.cukes:cucumber-java:1.2.5")
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:3.141.59")
}

tasks.test{
    useJUnit()
}

/*
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}*/