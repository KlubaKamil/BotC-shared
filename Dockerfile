#docker buildx build --platform linux/arm64 -t 192.168.1.19:30500/botc-shared:1.2.0 --push . --secret id=maven_settings,src=C:\Users\czach\.m2\settings.xml

# ---------- BUILD STAGE ----------
FROM maven:4.0.0-rc-4-eclipse-temurin-25 AS build
WORKDIR /build
RUN --mount=type=secret,id=maven_settings mkdir -p /root/.m2 && cp /run/secrets/maven_settings /root/.m2/settings.xml
COPY pom.xml .
COPY src ./src
RUN mvn clean install deploy -e

# ---------- RUNTIME STAGE ----------
FROM eclipse-temurin:25-jre-jammy
WORKDIR /app
COPY --from=build /build/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]