FROM openjdk:17
LABEL auther="maxtheservice"
RUN ["echo", "WELCOME TO THE maxtheservice YOUTUBE CHANNLE"]
EXPOSE 8098
ENV JAVA_HOME="C:\Program Files\Java\jdk-17"
CMD [ "echo", "$JAVA_HOME"]
ADD target/demo-0.0.1-SNAPSHOT.jar demo.jar
# COPY --from=build target/*.jar demo.jar
ENTRYPOINT [ "java", "-jar", "demo.jar" ]

ARG evn=dev
# VOLUME [ "/data" ]

# FROM ubuntu:latest
# RUN apt-get -y update
# RUN groupadd -r user && useradd -r -g user user
# USER user

# WORKDIR /demo

# ARG user=maxtheservice
# ARG build=v1.1


# ONBUILD COPY Dockerfile /data