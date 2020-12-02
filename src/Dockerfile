# Install Tomcat & openjdk 8 (openjdk has java and javac)
FROM tomcat:jdk13-openjdk
# Copy source files to tomcat folder structure
COPY ./app/ /usr/local/tomcat/webapps/
# -cp, Adding compile time classpath as Tomcat's /lib/servlet-api.jar file.
# - d, destination output location.
# RUN ["ls", "/usr/local/tomcat/webapps"]
#RUN ["javac", "-cp", "/usr/local/tomcat/webapps/app/WEB-INF/libs/*:/usr/local/tomcat/lib/servlet-api.jar", "-d", "/usr/local/tomcat/webapps/app/WEB-INF/classes/", "-sourcepath", "/usr/local/tomcat/webapps/app/src", "/usr/local/tomcat/webapps/app/src/AddingSession.java"]
RUN ["javac", "-cp", "/usr/local/tomcat/webapps/app/WEB-INF/libs/*:/usr/local/tomcat/lib/servlet-api.jar", "-d", "/usr/local/tomcat/webapps/app/WEB-INF/classes/", "/usr/local/tomcat/webapps/app/src/com/code/*.java", "/usr/local/tomcat/webapps/app/src/object/*.java"]
# Serve Tomcat
EXPOSE 8080
CMD ["catalina.sh", "run"]