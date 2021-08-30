SET GLOBAL  time_zone = '+1:00';
    CREATE DATABASE IF NOT EXISTS BookingApp;
    USE BookingApp;

    CREATE TABLE IF NOT EXISTS User(
    id int not null auto_increment,
    name varchar(100) not null,
    phoneNumber int not null,
    last_updated timestamp default current_timestamp,
    created_at timestamp default current_timestamp,
    primary key(id)
    );


    CREATE TABLE Specialist(
    id int not null auto_increment,
    specialist varchar(100) not null,
    last_updated timestamp default current_timestamp,
    created_at timestamp default current_timestamp,
    primary key(id)
    );
    select * from specialist;


    CREATE TABLE IF NOT EXISTS Timeslot(
    id int not null auto_increment,
    courseId varchar(100),
    examDate varchar(100),
    studentId varchar(100),
    result int not null,
    last_updated timestamp default current_timestamp,
    created_at timestamp default current_timestamp,
    primary key(id)
    );




