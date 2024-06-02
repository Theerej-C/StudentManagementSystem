FROM openjdk:8
EXPOSE 8080
ADD target/student-management.jar student-management.jar
ENTRYPOINT [ "java","-jar","/student-management.jar"]