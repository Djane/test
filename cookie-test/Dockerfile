FROM openjdk:14-alpine
COPY target/cookie-test-*.jar cookie-test.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "cookie-test.jar"]