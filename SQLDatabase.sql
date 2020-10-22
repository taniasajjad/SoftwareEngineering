CREATE DATABASE BostonCode;


create table Speaker (
speaker_id int,
name varchar(255),
day_of_contact varchar(255),
phone_number varchar(12),
email varchar(255),
  
PRIMARY KEY (speaker_id)

);

create table Room (
room_id int,
room_number varchar(255),
seats int,

PRIMARY KEY (room_id)
  
);

create table Time_Slot(
time_slot_id int,
time_start time,
time_end time,
  
PRIMARY KEY (time_slot_id)
  
);

create table Session (
session_id int,
session_name varchar(255),
time_slot_id int,
room_id int,
speaker_id int,

PRIMARY KEY (session_id),
FOREIGN KEY (room_id) REFERENCES Room(room_id),
FOREIGN KEY (time_slot_id) REFERENCES Time_Slot(time_slot_id),
FOREIGN KEY (speaker_id) REFERENCES Speaker(speaker_id)

);





/* DROP DATABASE bostoncamp; */
