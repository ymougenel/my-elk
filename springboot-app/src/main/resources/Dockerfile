FROM maven:3.6-jdk-8 AS build

COPY pom.xml /usr/src/app/

# build all dependencies for offline use
# avoid docker cache invalidation
RUN mvn -f /usr/src/app/pom.xml dependency:go-offline -B

COPY src /usr/src/app/src

RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests

FROM java:8u111

#TODO timezone as argument

RUN echo "Europe/Paris" > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata

COPY --from=build /usr/src/app/target/sandbox-elk-0.0.1-SNAPSHOT.jar /opt/sandbox-elk.jar

CMD ["java","-jar", "/opt/sandbox-elk.jar"]
