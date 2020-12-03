# Boston Code Camp Scheduler

## COMP-4960 Final Project

A web app to manage session scheduling for the Boston Code Camp conference

![screenshot](https://github.com/taniasajjad/SoftwareEngineering/blob/master/.github/session-list-screenshot.png)

## Set Up

1. [Install Docker](https://docs.docker.com/get-docker/)
1. Clone this repo
1. Run `docker-compose up` in the top dir of the project
1. Navigate to `http://localhost/app` in your browser(Chrome works best)

## Adding a Session

1. Click on [Adding New](http://localhost/app/Session.jsp) in top right corner
1. Fill out the session information
    - Time cannot be longer than 2 hours
1. Fill out speaker information
    - Phone number cannot be longer than 10 digits and must be an American number
    - Email cannot already be in use

## Edit a Session

1. On [Session List](http://localhost/app/index.jsp) click the `Edit` button on the session you would like to update
1. Select the information you would like to change
1. On the following screen change that information and confirm

## Deploying outside of Docker

1. Set the following environment variables:
   - `MYSQL_URL` - Address of the MySQL database
     - ex: `jdbc:mysql://127.0.0.1:3306/db`
     - `jdbc:mysql://<address>:<port>/<database_name>`
   - `MYSQL_USER` - User with access to required data
     - ex: `root`
   - `MYSQL_PASSWORD` - Password of user
     - ex: `password123`
1. Build Java classes. See `Dev` section bellow.
1. Import database files into your MySQL database.
1. Import the web app into Tomcat

## Dev

- **Database**: MySQL v8.0.22
- **Web Server**: Tomcat v9.0.39
- Command to build class files locally(Windows):

```(bash)
javac \
  -cp ".\src\app\WEB-INF\lib\*" \
  -d ".\src\app\WEB-INF\classes" \
  .\src\app\src\com\code\*.java \
  .\src\app\src\object\*.java
```

- Command to build class files locally(Unix):

```(bash)
javac \
  -cp "./src/app/WEB-INF/lib/*" \
  -d "./src/app/WEB-INF/classes" \
  ./src/app/src/com/code/*.java \
  ./src/app/src/object/*.java
```

- Docker copies all java files into the `tomcat` container and compiles on build
- Rebuild container again after making changes: `docker-compose up --build`

## Credits

### Front-End

- Tania Sajjad
- Raymond Ren
- Phuc Hoang Pham
- Bruce Ye

### Back-End

- Hao Phan
- Nhu Nguyen
- Dan Roche
- Cameron Ryde
- Jacob Quilty
