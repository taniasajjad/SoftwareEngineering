# FROM tomcat:jdk8-openjdk
FROM tomcat:9.0.39-jdk8-openjdk
COPY app/ /usr/local/tomcat/webapps/app
RUN javac \
  -cp /usr/local/tomcat/webapps/app/WEB-INF/lib/*:/usr/local/tomcat/lib/servlet-api.jar \
  -d /usr/local/tomcat/webapps/app/WEB-INF/classes/ \
  /usr/local/tomcat/webapps/app/src/com/code/*.java \
  /usr/local/tomcat/webapps/app/src/object/*.java
EXPOSE 8080
CMD ["catalina.sh", "run"]