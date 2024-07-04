FROM openjdk:17
VOLUME /tmp
EXPOSE 8082  
COPY target/cpen208api.jar cpen208api.jar 
ENTRYPOINT [ "java", "-jar", "cpen208api.jar"]

