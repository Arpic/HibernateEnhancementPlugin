dependencies {
    implementation("org.hibernate:hibernate-core:5.6.9.Final")
}
tasks.named<org.gradle.jvm.tasks.Jar>("jar") { archiveFileName.set("hibernateenhancement-jps-plugin.jar") }