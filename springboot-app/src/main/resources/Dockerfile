FROM java:8u111

#TODO timezone as argument

RUN echo "Europe/Paris" > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata

COPY target/sandbox-elk-0.0.1-SNAPSHOT.jar /opt/sandbox-elk.jar

CMD ["java","-jar", "/opt/sandbox-elk.jar"]