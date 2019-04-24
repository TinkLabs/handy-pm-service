FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
RUN mkdir /app
#RUN curl -L -O https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-7.0.0-linux-x86_64.tar.gz && \
#tar xzvf filebeat-7.0.0-linux-x86_64.tar.gz
RUN wget -O filebeat-7.0.0-linux-x86_64.tar.gz https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-7.0.0-linux-x86_64.tar.gz && \
tar xzvf filebeat-7.0.0-linux-x86_64.tar.gz
COPY filebeat.yml /filebeat-7.0.0-linux-x86_64/
RUN chmod go-w /filebeat-7.0.0-linux-x86_64/filebeat.yml
RUN wget -O /app/elastic-apm-agent-1.5.0.jar https://search.maven.org/remotecontent?filepath=co/elastic/apm/elastic-apm-agent/1.5.0/elastic-apm-agent-1.5.0.jar
COPY target/${JAR_FILE} /app/app.jar
ENTRYPOINT ["java","-javaagent:/app/elastic-apm-agent-1.5.0.jar","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]
