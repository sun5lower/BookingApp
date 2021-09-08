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


 CREATE TABLE UsersBookings(
    id int not null auto_increment,
    userId int not null,
    specialistId int not null,
    timeId int not null,
    primary key(id)
    );
    drop table user;

     CREATE TABLE IF NOT EXISTS User(
    id int not null auto_increment,
    name varchar(100) not null,
    phoneNumber int not null,
    specialist varchar(100) not null,
    date varchar(100) not null,
    primary key(id)
    );
    select * from user;
    
    use BookingApp;