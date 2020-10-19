CREATE DATABASE BostonCode;


create table Speaker (
speakerID int,
lastName varchar(255),
dayContact varchar(255),
phoneNumber varchar(12),
email varchar(255)

);

create table Room (
roomID int,
roomNumber varchar(255),
seats int,


);

/*i didnt create the session table just did have of it
create table Session (
sessionID int,
PRIMARY KEY (sessionID),
sessionName varchar(255),
timeSlot varchar(255),
roomID int,

FOREIGN KEY (roomID) REFERENCES Room(roomID)

);
*/





/* DROP DATABASE bostoncamp; */
